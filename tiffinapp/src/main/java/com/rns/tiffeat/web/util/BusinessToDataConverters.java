package com.rns.tiffeat.web.util;

import static org.apache.commons.lang3.StringUtils.isNotEmpty;
import static org.apache.commons.lang3.StringUtils.trimToEmpty;

import java.math.BigDecimal;
import java.util.Date;

import com.rns.tiffeat.web.bo.domain.CustomerOrder;
import com.rns.tiffeat.web.bo.domain.DailyContent;
import com.rns.tiffeat.web.bo.domain.MealFormat;
import com.rns.tiffeat.web.bo.domain.OrderStatus;
import com.rns.tiffeat.web.bo.domain.PayUDetails;
import com.rns.tiffeat.web.bo.domain.Vendor;
import com.rns.tiffeat.web.dao.domain.Customer;
import com.rns.tiffeat.web.dao.domain.CustomerMeal;
import com.rns.tiffeat.web.dao.domain.DailyMeal;
import com.rns.tiffeat.web.dao.domain.Meal;
import com.rns.tiffeat.web.dao.domain.Order;
import com.rns.tiffeat.web.dao.domain.Transaction;

public class BusinessToDataConverters {

	public static void convertCustomer(Customer customerToBeAdded, com.rns.tiffeat.web.bo.domain.Customer customer) {
		if(customerToBeAdded == null || customer == null) {
			return;
		}
		customerToBeAdded.setEmail(trimToEmpty(customer.getEmail()));
		customerToBeAdded.setPassword(trimToEmpty(customer.getPassword()));
		customerToBeAdded.setPhone(trimToEmpty(customer.getPhone()));
		customerToBeAdded.setDeviceId(trimToEmpty(customer.getDeviceId()));
		customerToBeAdded.setRegId(trimToEmpty(customer.getRegId()));
		customerToBeAdded.setName(trimToEmpty(customer.getName()));
	}
	
	public static void convertCustomerMeal(com.rns.tiffeat.web.dao.domain.Customer customerToBeAdded, CustomerMeal meal, CustomerOrder order) {
		if(customerToBeAdded == null || meal == null || order == null) {
			return;
		}
		Meal mealToBeAdded = new Meal();
		convertMeal(mealToBeAdded , order.getMeal());	
		meal.setMeal(mealToBeAdded);
		meal.setFormat(order.getMealFormat().name());
		meal.setPinCode(CommonUtil.getPinCode(trimToEmpty(order.getArea())));
		meal.setAddress(trimToEmpty(order.getAddress()));
		meal.setCustomer(customerToBeAdded);
		meal.setDate(order.getDate());
		if(order.getMealFormat() != null) {
			meal.setFormat(order.getMealFormat().name());
		}
		if(order.getMealType() != null) {
			meal.setMealType(order.getMealType().name());
		}
	}
	
	public static void convertMeal(com.rns.tiffeat.web.dao.domain.Meal mealToBeAdded, com.rns.tiffeat.web.bo.domain.Meal meal) {
		if(mealToBeAdded == null || meal == null) {
			return;
		}
		mealToBeAdded.setId(meal.getId());
		if(isNotEmpty(meal.getTitle())) {
			mealToBeAdded.setTitle(trimToEmpty(meal.getTitle()));
		}
		if(isNotEmpty(meal.getDescription())) {
			mealToBeAdded.setDescription(trimToEmpty(meal.getDescription()));
		}
		if(meal.getPrice() != null) {
			mealToBeAdded.setPrice(meal.getPrice());
		}
	}
	
	public static void convertDailyMeal(DailyMeal dailyMealToBeAdded, DailyContent dailyContent) {
		dailyMealToBeAdded.setMainCourse(trimToEmpty(dailyContent.getMainItem()));
		dailyMealToBeAdded.setSubItem1(trimToEmpty(dailyContent.getSubItem1()));
		dailyMealToBeAdded.setSubItem2(trimToEmpty(dailyContent.getSubItem2()));
		dailyMealToBeAdded.setSubItem3(trimToEmpty(dailyContent.getSubItem3()));
		dailyMealToBeAdded.setSubItem4(trimToEmpty(dailyContent.getSubItem4()));
		if (dailyContent.getMealType() != null) {
			dailyMealToBeAdded.setType(dailyContent.getMealType().name());
		}
		if(dailyContent.getDate()!= null) {
			dailyMealToBeAdded.setDate(dailyContent.getDate());
		}
	}
	
	public static void convertVendor(com.rns.tiffeat.web.dao.domain.Vendor vendorToBeRegistered, Vendor vendor) {
		vendorToBeRegistered.setName(trimToEmpty(vendor.getName()));
		vendorToBeRegistered.setEmail(trimToEmpty(vendor.getEmail()));
		vendorToBeRegistered.setPassword(trimToEmpty(vendor.getPassword()));
		vendorToBeRegistered.setPinCode(trimToEmpty(vendor.getPinCode()));
		vendorToBeRegistered.setAddress(trimToEmpty(vendor.getAddress()));
		vendorToBeRegistered.setPhone(trimToEmpty(vendor.getPhone()));
	}
	
	public static Order convertOrder(CustomerMeal mealToBeAdded, CustomerOrder customerOrder) {
		Order order = new Order();
		order.setCustomerMeal(mealToBeAdded);
		order.setStatus(OrderStatus.ORDERED.name());
		order.setTransactionId(customerOrder.getTransactionId());
		if(customerOrder.getPaymentType() !=null) {
			order.setPaymentType(customerOrder.getPaymentType().name());
		}
		order.setDate(mealToBeAdded.getDate());
		if(!CommonUtil.checkIfToday(order.getDate()) && MealFormat.SCHEDULED.name().equals(mealToBeAdded.getFormat())) {
			return order;
		}
		return order;
	}
	
	public static void convertTransaction(PayUDetails payUDetails, Transaction transaction) {
		if(payUDetails == null || transaction == null) {
			return;
		}
		transaction.setAmount(BigDecimal.valueOf(payUDetails.getAmount()));
		transaction.setCustomerEmail(trimToEmpty(payUDetails.getEmail()));
		transaction.setDate(new Date());
	}
	
}
