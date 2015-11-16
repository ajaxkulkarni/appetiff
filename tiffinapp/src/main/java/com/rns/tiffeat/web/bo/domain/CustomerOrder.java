package com.rns.tiffeat.web.bo.domain;

import java.io.Serializable;
import java.util.Date;

public class CustomerOrder implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private Meal meal;
	private Date date;
	private MealType mealType;
	private Customer customer;
	private MealFormat mealFormat;
	private String area;
	private String address;
	private PaymentType paymentType;
	private DailyContent content;
	private OrderStatus status;
	private String transactionId;
	
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Meal getMeal() {
		return meal;
	}
	public void setMeal(Meal meal) {
		this.meal = meal;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public MealType getMealType() {
		return mealType;
	}
	public void setMealType(MealType mealType) {
		this.mealType = mealType;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public MealFormat getMealFormat() {
		return mealFormat;
	}
	public void setMealFormat(MealFormat mealFormat) {
		this.mealFormat = mealFormat;
	}
	public PaymentType getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public DailyContent getContent() {
		return content;
	}
	public void setContent(DailyContent content) {
		this.content = content;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	
}
