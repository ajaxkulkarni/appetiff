package com.rns.tiffeat.web.bo.api;
import java.math.BigDecimal;
import java.util.List;

import com.rns.tiffeat.web.bo.domain.Customer;
import com.rns.tiffeat.web.bo.domain.CustomerOrder;
import com.rns.tiffeat.web.bo.domain.MealType;
import com.rns.tiffeat.web.bo.domain.PayUDetails;
import com.rns.tiffeat.web.bo.domain.Vendor;

public interface CustomerBo {

	//void submitFeedback(Meal meal);
	String register(Customer customer);
	boolean login(Customer customer);
	
	List<Vendor> getAvailableVendors(String area);
	Vendor getVendorWithMeals(Vendor vendor);
	MealType[] getAvailableMealType(CustomerOrder order);
	
	String quickOrder(CustomerOrder customerOrder);
	String scheduledOrder(List<CustomerOrder> customerOrders);
	
	String changeScheduledOrder(CustomerOrder customerOrder);
	String cancelScheduledOrder(CustomerOrder customerOrder);
	
	String addMoneyToWallet(Customer currentCustomer);
	//void addMeal(Customer customer);
	public long addTransaction(PayUDetails payUDetails);
	
	void setCurrentCustomer(Customer currentCustomer);
	
	public String validateQuickOrder(CustomerOrder customerOrder);
	
	public void rateMeal(CustomerOrder order, BigDecimal rating);
}
