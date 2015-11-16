package com.rns.tiffeat.web.controller;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.rns.tiffeat.web.bo.api.CustomerBo;
import com.rns.tiffeat.web.bo.api.SessionManager;
import com.rns.tiffeat.web.bo.domain.Customer;
import com.rns.tiffeat.web.bo.domain.CustomerOrder;
import com.rns.tiffeat.web.bo.domain.Meal;
import com.rns.tiffeat.web.bo.domain.MealFormat;
import com.rns.tiffeat.web.bo.domain.MealType;
import com.rns.tiffeat.web.bo.domain.PayUDetails;
import com.rns.tiffeat.web.bo.domain.PaymentType;
import com.rns.tiffeat.web.bo.domain.Vendor;
import com.rns.tiffeat.web.util.CommonUtil;
import com.rns.tiffeat.web.util.Constants;
import com.rns.tiffeat.web.util.GoogleUtil;
import com.rns.tiffeat.web.util.MailUtil;
import com.rns.tiffeat.web.util.PaymentUtils;


@Controller
public class CustomerControllerWeb implements Constants {
	
	private static final String MODEL_RESOURCES = "resources";

	private CustomerBo customerBo;
	
	@Autowired(required = true)
	@Qualifier(value = "manager")
	private SessionManager manager;
	
	public void setManager(SessionManager manager) {
		this.manager = manager;
	}
	
	public SessionManager getManager() {
		return manager;
	}

	
	public CustomerBo getCustomerBo() {
		return customerBo;
	}
	
	@Autowired(required = true)
	@Qualifier(value = "customerBo")
	public void setCustomerBo(CustomerBo customerBo) {
		this.customerBo = customerBo;
	}
	
	@RequestMapping(value = "/home.htm", method = RequestMethod.GET)
	public String initPage(ModelMap model) {
		prepareIndexPage(model);
		return "index";
	}

	private void prepareIndexPage(ModelMap model) {
		model.addAttribute(MODEL_AREAS, Constants.AREAS);
		model.addAttribute(MODEL_VENDORS, manager.getAvailableVendors());
		model.addAttribute(MODEL_CUSTOMER, manager.getCustomer());
		if(CollectionUtils.isNotEmpty(manager.getAvailableVendors())) {
			model.addAttribute(MODEL_PIN_CODE, manager.getAvailableVendors().get(0).getPinCode());
		}
		model.addAttribute(MODEL_RESOURCES, ASSETS_ROOT);
		manager.setResult(null);
	}
	
	@RequestMapping(value = "/getNearbyVendors", method = RequestMethod.POST)
	public RedirectView getVendorsNearby(String pinCode,ModelMap model) {
		manager.setAvailableVendors(customerBo.getAvailableVendors(pinCode));
		manager.setResult(null);
		return new RedirectView("home.htm");
	}
	
	@RequestMapping(value = "/customerSelectVendor", method = RequestMethod.POST)
	public RedirectView selectVendors(String pinCode,ModelMap model) {
		if(StringUtils.isNotEmpty(pinCode)) {
			manager.setAvailableVendors(customerBo.getAvailableVendors(pinCode));
		}
		manager.setResult(null);
		return new RedirectView("home.htm");
	}
	
	@RequestMapping(value = "/getVendorMeals.htm", method = RequestMethod.GET)
	public String getVendorMeals(String vendorEmail,ModelMap model) {
		if(CollectionUtils.isEmpty(manager.getAvailableVendors())) {
			prepareIndexPage(model);
			return "index";
		}
		Vendor vendor = new Vendor();
		vendor.setEmail(vendorEmail);
		manager.getCustomer().getOrderInProcess().setArea(manager.getAvailableVendors().get(0).getPinCode());
		model.addAttribute(MODEL_VENDOR, customerBo.getVendorWithMeals(vendor));
		model.addAttribute(MODEL_PIN_CODE, manager.getAvailableVendors().get(0).getPinCode());
		model.addAttribute(MODEL_CUSTOMER, manager.getCustomer());
		model.addAttribute(MODEL_RESOURCES, ASSETS_ROOT);
		manager.setResult(null);
		return "customer_select_meals";
	}
	
	@RequestMapping(value = "/selectMealFormat", method = RequestMethod.POST)
	public RedirectView selectMealFormat(Meal meal,ModelMap model) {
		CustomerOrder customerOrder = manager.getCustomer().getOrderInProcess();
		customerOrder.setMeal(meal);
		customerOrder.setCustomer(manager.getCustomer());
		if(customerOrder != null && MealFormat.SCHEDULED.equals(customerOrder.getMealFormat())) {
			if(customerOrder.getId() == 0) {
				return new RedirectView("scheduledOrder.htm");
			}
			String changeScheduledOrderResult = customerBo.changeScheduledOrder(customerOrder);
			manager.setResult(changeScheduledOrderResult);
			System.out.println("Result of change order :" +changeScheduledOrderResult);
			return new RedirectView("customerHome.htm");
		}
		model.addAttribute(MODEL_CUSTOMER_ORDER, customerOrder);
		manager.setResult(null);
		return new RedirectView("selectMealFormat.htm");
	}
	
	@RequestMapping(value = "/selectMealFormat.htm", method = RequestMethod.GET)
	public String initSelectMealFormat(ModelMap model) {
		model.addAttribute(MODEL_CUSTOMER_ORDER, manager.getCustomer().getOrderInProcess());
		model.addAttribute(MODEL_CUSTOMER, manager.getCustomer());
		model.addAttribute(MODEL_RESOURCES, ASSETS_ROOT);
		manager.setResult(null);
		return "customer_meal_format";
	}
	
	@RequestMapping(value = "/scheduledOrder.htm", method = RequestMethod.GET)
	public String scheduledOrder(ModelMap model) {
		if(manager ==null || StringUtils.isEmpty(manager.getCustomer().getEmail())) {
			return "error";
		}
		prepareOrderDetails(manager.getCustomer().getOrderInProcess(), model);
		MealType[] mealTypes = new MealType[1];
		if(manager.getCustomer().getOrderInProcess().getMealType()!=null) {
			mealTypes[0] = manager.getCustomer().getOrderInProcess().getMealType();
			model.addAttribute(MODEL_MEAL_TYPE, mealTypes);
		}
		else {
			model.addAttribute(MODEL_MEAL_TYPE, MealType.values());
		}
		customerBo.getAvailableMealType(manager.getCustomer().getOrderInProcess());
		model.addAttribute(MODEL_AREAS, Constants.AREAS);
		return "customer_scheduled_order_details";
	}

	private void prepareOrderDetails(CustomerOrder order, ModelMap model/*, String pinCode*/) {
		order.setDate(new Date());
		order.setCustomer(manager.getCustomer());
		prepareOrderAdress(order);
		model.addAttribute(MODEL_SELECTED_AREA_ENTRY, CommonUtil.getSelectedArea(CommonUtil.getPinCode(order.getArea())));
		model.addAttribute(MODEL_MEAL_TYPE, customerBo.getAvailableMealType(order));
		model.addAttribute(MODEL_CUSTOMER_ORDER,order);
		model.addAttribute(MODEL_PAYMENT_TYPES, PaymentType.values());
		model.addAttribute(MODEL_CUSTOMER, manager.getCustomer());
		model.addAttribute(MODEL_RESOURCES, ASSETS_ROOT);
	}
	
	private void prepareOrderAdress(CustomerOrder order) {
		if(order == null || order.getCustomer() == null || order.getAddress()!=null) {
			return;
		}
		checkForEqualAddress(order.getCustomer().getQuickOrders(),order);
		checkForEqualAddress(order.getCustomer().getPreviousOrders(),order);
	}

	private void checkForEqualAddress(List<CustomerOrder> orders,CustomerOrder customerOrder) {
		if(CollectionUtils.isNotEmpty(orders) && customerOrder.getAddress() == null) {
			for(CustomerOrder order:orders) {
				if(StringUtils.equals(customerOrder.getArea(), order.getArea())) {
					customerOrder.setAddress(order.getAddress());
					return;
				}
			}
		}
	}

	@RequestMapping(value = "/quickOrder.htm", method = RequestMethod.GET)
	public String quickOrder(ModelMap model) {
		if(manager ==null || StringUtils.isEmpty(manager.getCustomer().getEmail())) {
			return "error";
		}
		prepareOrderDetails(manager.getCustomer().getOrderInProcess(), model);
		model.addAttribute(MODEL_RESULT, manager.getResult());
		return "customer_registered_quick_order_details";
	}
	
	@RequestMapping(value = "/registerCustomer", method = RequestMethod.POST)
	public RedirectView registerCustomer(Customer customer/*,CustomerOrder order*/,ModelMap model) {
		String result = customerBo.register(customer);
		if(!RESPONSE_OK.equals(result)) {
			manager.setResult(result);
			return new RedirectView("registerCustomer.htm");
		}
		manager.setResult(null);
		manager.getCustomer().setId(customer.getId());
		customerBo.setCurrentCustomer(manager.getCustomer());
		if(MealFormat.QUICK.equals(manager.getCustomer().getOrderInProcess().getMealFormat())) {
			return new RedirectView("quickOrder.htm");
		}
		else if(MealFormat.SCHEDULED.equals(manager.getCustomer().getOrderInProcess().getMealFormat())) {
			return new RedirectView("scheduledOrder.htm");
		}
		return new RedirectView("home.htm");
	}
	
	@RequestMapping(value = "/registerCustomer.htm", method = RequestMethod.GET)
	public String initRegisterCustomer(/*long mealId,MealFormat format,String pinCode,*/ModelMap model) {
		Customer customer = new Customer();
		model.addAttribute(MODEL_CUSTOMER, customer);
		model.addAttribute(MODEL_RESULT, manager.getResult());
		model.addAttribute(MODEL_RESOURCES, ASSETS_ROOT);
		return "customer_register";
	}
	
	@RequestMapping(value = "/checkRegistration.htm", method = RequestMethod.GET)
	public RedirectView checkRegistration(/*long mealId,String pinCode,*/MealFormat format,ModelMap model) {
		customerBo.setCurrentCustomer(manager.getCustomer());
		manager.getCustomer().getOrderInProcess().setMealFormat(format);
		if(manager == null || StringUtils.isEmpty(manager.getCustomer().getEmail())) {
			return new RedirectView("registerCustomer.htm");
		}
		if(MealFormat.QUICK.equals(format)) {
			return new RedirectView("quickOrder.htm");
		}
		return new RedirectView("scheduledOrder.htm");
	}
	
	@RequestMapping(value = "/quickOrder", method = RequestMethod.POST)
	public RedirectView quickOrder(CustomerOrder customerOrder ,ModelMap model) {
		
		if(customerBo.getAvailableMealType(customerOrder) == null) {
			return new RedirectView("quickOrder.htm");
		}
		if(customerOrder.getDate() == null) {
			customerOrder.setDate(manager.getCustomer().getOrderInProcess().getDate());
		}
		if(PaymentType.CASH.equals(customerOrder.getPaymentType())) {
			String result = customerBo.validateQuickOrder(customerOrder);
			if(WARNING_DATE_CHANGED.equals(result)) {
				manager.setResult("Today's meal for " + customerOrder.getMealType() + " is not available!" + "You can order for tomorrow.");
				return new RedirectView("quickOrder.htm");
			}
			if(!RESPONSE_OK.equals(result)) {
				manager.setResult(result);
				return new RedirectView("quickOrder.htm");
			}
			customerBo.quickOrder(customerOrder);
			return new RedirectView("customerHome.htm");
		}
		
		String result = customerBo.validateQuickOrder(customerOrder);
		if(WARNING_DATE_CHANGED.equals(result)) {
			manager.setResult("Today's meal for " + customerOrder.getMealType() + " is not available!" + "You can order for tomorrow.");
			return new RedirectView("quickOrder.htm");
		}
		if(!RESPONSE_OK.equals(result)) {
			manager.setResult(result);
			return new RedirectView("quickOrder.htm");
		}
		manager.setResult(result);
		manager.getCustomer().setOrderInProcess(customerOrder);
		return new RedirectView("payment.htm");
	}
	
	@RequestMapping(value = "/payment.htm", method = RequestMethod.GET)
	public String payment(ModelMap model) {
		if(StringUtils.isEmpty(manager.getCustomer().getEmail())) {
			return "error";
		}
		try {
			PayUDetails payUDetails = PaymentUtils.preparePayUDetails(manager.getCustomer().getOrderInProcess());
			payUDetails.setId("T" + customerBo.addTransaction(payUDetails));
			payUDetails.setHashKey(PaymentUtils.prepareHashKey(payUDetails));
			manager.getCustomer().getOrderInProcess().setTransactionId(payUDetails.getId());
			model.addAttribute(MODEL_PAY_U_DETAILS,payUDetails);
			model.addAttribute(MODEL_CUSTOMER_ORDER, manager.getCustomer().getOrderInProcess());
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return "customer_payment";
	}
	
	@RequestMapping(value = "/paymentResult", method = RequestMethod.POST)
	public RedirectView paymentResult(ModelMap model,HttpServletRequest request) {
		RedirectView view = new RedirectView("customerHome.htm");
		String paymentResult = request.getParameter("status");
		System.out.println("Result of payment :" + paymentResult);
		if(paymentResult!=null && manager.getCustomer().getOrderInProcess().getMeal() == null) {
			return new RedirectView("paymentAndroidResult.htm?result=" + paymentResult);
		}
		manager.getCustomer().getOrderInProcess().setPaymentType(PaymentUtils.getPaymenType(request.getParameter("mode")));
		if(StringUtils.equalsIgnoreCase("success", paymentResult)) {
			if(MealFormat.SCHEDULED.equals(manager.getCustomer().getOrderInProcess().getMealFormat())) {
				String addMoneyToWalletResult = customerBo.addMoneyToWallet(manager.getCustomer());
				if(!RESPONSE_OK.equals(addMoneyToWalletResult)) {
					manager.setResult(addMoneyToWalletResult);
					view = new RedirectView("addMoneyToWallet.htm");
				}
			}
			else {
				String quickOrderResult = customerBo.quickOrder(manager.getCustomer().getOrderInProcess());
				if(!RESPONSE_OK.equals(quickOrderResult)) {
					manager.setResult(quickOrderResult);
					view = new RedirectView("quickOrder.htm");
				}
			}
		}
		else {
			manager.setResult("Payment failed!!");
			if(MealFormat.SCHEDULED.equals(manager.getCustomer().getOrderInProcess().getMealFormat())) {
				view = new RedirectView("addMoneyToWallet.htm");
			}
			else {
				view = new RedirectView("quickOrder.htm");
			}
		}
		MailUtil.sendMail(manager.getCustomer().getOrderInProcess());
		return view;
	}
	
	@RequestMapping(value = "/customerLogin.htm", method = RequestMethod.GET)
	public String prepareCustomerLogin(ModelMap model) {
		model.addAttribute(MODEL_CUSTOMER, new Customer());
		model.addAttribute(MODEL_RESULT, manager.getResult());
		model.addAttribute(MODEL_RESOURCES, ASSETS_ROOT);
		return "customer_login";
	}
	
	@RequestMapping(value = "/customerLogin", method = RequestMethod.POST)
	public RedirectView customerLogin(Customer customer,ModelMap model) {
		if(!customerBo.login(customer)) {
			manager.setResult("Invalid login credentials!");
			return new RedirectView("customerLogin.htm");
		}
		manager.setResult(null);
		manager.getCustomer().setId(customer.getId());
		if(manager.getCustomer().getOrderInProcess() != null) {
			customerBo.setCurrentCustomer(manager.getCustomer());
			if(MealFormat.QUICK.equals(manager.getCustomer().getOrderInProcess().getMealFormat())) {
				return new RedirectView("quickOrder.htm");
			}
			else if(MealFormat.SCHEDULED.equals(manager.getCustomer().getOrderInProcess().getMealFormat())) {
				return new RedirectView("scheduledOrder.htm");
			}
		}
		return new RedirectView("customerHome.htm");
	}
	
	@RequestMapping(value = "/customerHome.htm", method = RequestMethod.GET)
	public String customerHomePage(ModelMap model) {
		customerBo.setCurrentCustomer(manager.getCustomer());
		manager.getCustomer().setOrderInProcess(null);
		if(StringUtils.isEmpty(manager.getCustomer().getEmail())) {
			prepareIndexPage(model);
			return "index";
		}
		model.addAttribute(MODEL_CUSTOMER, manager.getCustomer());
		model.addAttribute(MODEL_RESULT, manager.getResult());
		model.addAttribute(MODEL_RESOURCES, ASSETS_ROOT);
		if(CollectionUtils.isEmpty(manager.getCustomer().getScheduledOrder())) {
			return "customer_quick_home";
		}
		return "customer_scheduled_home";
	}
	
	@RequestMapping(value = "/quickOrders.htm", method = RequestMethod.GET)
	public String showQuickOrders(ModelMap model) {
		customerBo.setCurrentCustomer(manager.getCustomer());
		manager.getCustomer().setOrderInProcess(null);
		if(StringUtils.isEmpty(manager.getCustomer().getEmail())) {
			prepareIndexPage(model);
			return "index";
		}
		model.addAttribute(MODEL_CUSTOMER, manager.getCustomer());
		model.addAttribute(MODEL_RESULT, manager.getResult());
		model.addAttribute(MODEL_RESOURCES, ASSETS_ROOT);
		return "customer_quick_home";
	}
	
	@RequestMapping(value = "/scheduledOrder", method = RequestMethod.POST)
	public RedirectView scheduleOrder(CustomerOrder customerOrder,ModelMap model) {
		List<CustomerOrder> scheduledOrders = new ArrayList<CustomerOrder>();
		if(customerOrder.getDate() == null) {
			customerOrder.setDate(manager.getCustomer().getOrderInProcess().getDate());
		}
		if(MealType.BOTH.equals(customerOrder.getMealType())/* && StringUtils.isNotEmpty(address2)*/) {
			CustomerOrder scheduledOrder = new CustomerOrder();
			scheduledOrder.setAddress(customerOrder.getAddress());
			scheduledOrder.setArea(customerOrder.getArea());
			customerOrder.setMealType(MealType.LUNCH);
			scheduledOrder.setMealType(MealType.DINNER);
			scheduledOrder.setMeal(customerOrder.getMeal());
			scheduledOrder.setCustomer(customerOrder.getCustomer());
			scheduledOrder.setDate(customerOrder.getDate());
			scheduledOrders.add(scheduledOrder);
		}
		scheduledOrders.add(customerOrder);
		manager.getCustomer().setPhone(customerOrder.getCustomer().getPhone());
		manager.getCustomer().setQuickOrders(scheduledOrders);
		String scheduledOrderResult = customerBo.scheduledOrder(scheduledOrders);
		if(!RESPONSE_OK.equals(scheduledOrderResult)) {
			manager.setResult(scheduledOrderResult);
			return new RedirectView("scheduledOrder.htm");
		}
		manager.setResult(null);
		customerOrder.setMealFormat(MealFormat.SCHEDULED);
		manager.getCustomer().setOrderInProcess(customerOrder);
		return new RedirectView("addMoneyToWallet.htm");
	}
	
	@RequestMapping(value = "/addMoneyToWallet.htm", method = RequestMethod.GET)
	public String initAddToWallet(ModelMap model) {
		if(StringUtils.isEmpty(manager.getCustomer().getEmail())) {
			return "error";
		}
		if(manager.getCustomer().getBalance() == null) {
			manager.getCustomer().setBalance(new BigDecimal(0));
		}
		model.addAttribute(MODEL_CUSTOMER, manager.getCustomer());
		model.addAttribute(MODEL_RESULT, manager.getResult());
		model.addAttribute(MODEL_RESOURCES, ASSETS_ROOT);
		return "customer_add_to_wallet";
	}
	
	@RequestMapping(value = "/addMoneyToWallet", method = RequestMethod.POST)
	public RedirectView addToWallet(BigDecimal amount,ModelMap model) {
		manager.getCustomer().setBalance(amount);
		CustomerOrder orderInProcess = manager.getCustomer().getOrderInProcess();
		if(orderInProcess.getMealFormat() == null) {
			orderInProcess.setMealFormat(MealFormat.SCHEDULED);
		}
		orderInProcess.setCustomer(manager.getCustomer());
		if(orderInProcess.getMeal() == null) {
			orderInProcess.setMeal(new Meal());
		}
		return new RedirectView("payment.htm");
	}
	
	@RequestMapping(value = "/cancelOrder", method = RequestMethod.POST)
	public RedirectView cancelOrder(CustomerOrder customerOrder,ModelMap model) {
		String result = customerBo.cancelScheduledOrder(customerOrder);
		if(!RESPONSE_OK.equals(result)) {
			manager.setResult(result);
		}
		return new RedirectView("customerHome.htm");
	}
	
	@RequestMapping(value = "/changeMeal", method = RequestMethod.POST)
	public RedirectView changeMeal(CustomerOrder customerOrder,ModelMap model) {
		MealType[] availableMealTypes = customerBo.getAvailableMealType(customerOrder);
		if(availableMealTypes == null) {
			System.out.println("Can't change this meal!!");
			manager.setResult(ERROR_CANT_CHANGE_THE_MEAL);
			return new RedirectView("customerHome.htm");
		}
		List<MealType> mealTypes = Arrays.asList(availableMealTypes);
		if(CollectionUtils.isEmpty(mealTypes) || !mealTypes.contains(customerOrder.getMealType())) {
			System.out.println("Can't change this meal now!!");
			manager.setResult(ERROR_CANT_CHANGE_THE_MEAL);
			return new RedirectView("customerHome.htm");
		}
		manager.setAvailableVendors(customerBo.getAvailableVendors(CommonUtil.getPinCode(customerOrder.getArea())));
		manager.getCustomer().setOrderInProcess(customerOrder);
		return new RedirectView("home.htm");
	}

	@RequestMapping(value = "/repeatOrder", method = RequestMethod.POST)
	public RedirectView repeat(CustomerOrder customerOrder/*,Meal meal*/,ModelMap model) {
		//customerOrder.setMeal(meal);
		manager.getCustomer().setOrderInProcess(customerOrder);
		return new RedirectView("selectMealFormat.htm");
	}
	
	@RequestMapping(value = "/addScheduledOrder", method = RequestMethod.POST)
	public RedirectView addScheduledOrder(CustomerOrder customerOrder,ModelMap model) {
		if(MealType.LUNCH.equals(customerOrder.getMealType())) {
			customerOrder.setMealType(MealType.DINNER);
		}
		else {
			customerOrder.setMealType(MealType.LUNCH);
		}
		customerOrder.setMealFormat(MealFormat.SCHEDULED);
		manager.getCustomer().setOrderInProcess(customerOrder);
		manager.setAvailableVendors(customerBo.getAvailableVendors(CommonUtil.getPinCode(customerOrder.getArea())));
		return new RedirectView("home.htm");
	}
	
	@RequestMapping(value = "/logout.htm", method = RequestMethod.GET)
	public RedirectView logout(ModelMap model) {
		manager.logoutCustomer();
		return new RedirectView("home.htm");
	}
	
	@RequestMapping(value = "/terms.htm", method = RequestMethod.GET)
	public String terms(ModelMap model) {
		model.addAttribute(MODEL_CUSTOMER, manager.getCustomer());
		model.addAttribute(MODEL_RESOURCES, ASSETS_ROOT);
		return "customer_terms";
	}
	
	@RequestMapping(value = "/aboutUs.htm", method = RequestMethod.GET)
	public String aboutUs(ModelMap model) {
		model.addAttribute(MODEL_CUSTOMER, manager.getCustomer());
		model.addAttribute(MODEL_RESOURCES, ASSETS_ROOT);
		return "customer_about_us";
	}
	
	@RequestMapping(value = "/contactUs.htm", method = RequestMethod.GET)
	public String contactUs(ModelMap model) {
		model.addAttribute(MODEL_CUSTOMER, manager.getCustomer());
		model.addAttribute(MODEL_RESOURCES, ASSETS_ROOT);
		return "customer_contact_us";
	}
	
	@RequestMapping(value = "/getGoogleCode", method = RequestMethod.GET)
	public String getGoogleCode(@RequestParam(value = "code") String code,ModelMap model) {
		System.out.println("Code received :" + code);
		try {
			GoogleUtil.getGoogleCustomer(code);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
        
		model.addAttribute(MODEL_AREAS, Constants.AREAS);
		return "index";
	}
	
	/*@RequestMapping(value = "*", method = RequestMethod.GET)
	public RedirectView handleAnyRequest() {
		System.out.println("Handling URL!");
		return new RedirectView("home.htm");
	}*/
	
}
