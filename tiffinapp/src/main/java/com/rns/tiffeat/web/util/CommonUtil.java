package com.rns.tiffeat.web.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map.Entry;

import com.rns.tiffeat.web.bo.domain.MealFormat;
import com.rns.tiffeat.web.bo.domain.MealStatus;
import com.rns.tiffeat.web.bo.domain.MealType;
import com.rns.tiffeat.web.bo.domain.OrderStatus;
import com.rns.tiffeat.web.bo.domain.PaymentType;

public class CommonUtil implements Constants {

	public static Date convertDate(String date) {
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
		Date parsedDate = new Date();
		try {
			parsedDate = sdf.parse(date);
		} catch (ParseException e) {
		}
		return parsedDate;
	}
	
	public static Date convertDate(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
		Date parsedDate = new Date();
		try {
			parsedDate = sdf.parse(sdf.format(date));
		} catch (ParseException e) {
		}
		return parsedDate;
	}

	public static int getCurrentHours() {
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		return c.get(Calendar.HOUR_OF_DAY);
	}

	public static MealType getMealType(String mealType) {
		if(MealType.LUNCH.name().equals(mealType)) {
			return MealType.LUNCH;
		}
		if(MealType.DINNER.name().equals(mealType)) {
			return MealType.DINNER;
		}
		return null;
	}
	
	public static MealType[] getMealTypes() {
		MealType[] mealtypes = new MealType[MealType.values().length-1];
		int i =0;
		for(MealType mealType:MealType.values()) {
			if(!MealType.BOTH.equals(mealType)) {
				mealtypes[i] = mealType;
				i++;
			}
		}
		return mealtypes;
	}
	
	
	public static MealStatus getMealPhase(String tiffinPhase) {
		if(MealStatus.COOKING.name().equals(tiffinPhase)) {
			return MealStatus.COOKING;
		}
		if(MealStatus.PREPARE.name().equals(tiffinPhase)) {
			return MealStatus.PREPARE;
		}
		if(MealStatus.DISPATCH.name().equals(tiffinPhase)) {
			return MealStatus.DISPATCH;
		}
		if(MealStatus.DELIVERED.name().equals(tiffinPhase)) {
			return MealStatus.DELIVERED;
		}
		return null;
	}

	public static MealFormat getMealFormat(String format) {
		if(MealFormat.QUICK.name().equals(format)) {
			return MealFormat.QUICK;
		}
		return MealFormat.SCHEDULED;
	}

	public static Date addDay() {
		Calendar c = Calendar.getInstance(); 
		c.setTime(new Date()); 
		c.add(Calendar.DATE, 1);
		return c.getTime();
	}
	
	public static boolean checkIfToday(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
		if(date == null) {
			return false;
		}
		try {
			Date date1 = sdf.parse(sdf.format(date));
			Date date2 = sdf.parse(sdf.format(new Date()));
			if(date1.compareTo(date2)==0){
	    		return true;
	    	}
		} catch (ParseException e) {
			
		}
    	
    	return false;
	}

	public static Date formatDate(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
		try {
			date = sdf.parse(sdf.format(date));
		} catch (ParseException e) {
			
		}
		return date;
	}

	public static Entry<String, String> getSelectedArea(String pinCode) {
		for(Entry<String, String> e:AREAS.entrySet()) {
			if(e.getKey().equals(pinCode)) {
				return e;
			}
		}
		return null;
	}
	
	public static String getPinCode(String area) {
		for(Entry<String, String> entry:AREAS.entrySet()) {
			if(entry.getValue().equals(area)){
				return entry.getKey();
			}
		}
		return null;
	}

	public static OrderStatus getOrderStatus(String status) {
		if(OrderStatus.ORDERED.name().equals(status)) {
			return OrderStatus.ORDERED;
		}
		if(OrderStatus.CANCELLED.name().equals(status)) {
			return OrderStatus.CANCELLED;
		}
		if(OrderStatus.CHANGED.name().equals(status)) {
			return OrderStatus.CHANGED;
		}
		if(OrderStatus.DELIVERED.name().equals(status)) {
			return OrderStatus.DELIVERED;
		}
		if(OrderStatus.PAYABLE.name().equals(status)) {
			return OrderStatus.PAYABLE;
		}
		return OrderStatus.NA;
	}

	public static PaymentType getPaymentType(String paymentType) {
		if(PaymentType.CASH.name().equals(paymentType)) {
			return PaymentType.CASH;
		}
		if(PaymentType.CREDIT.name().equals(paymentType)) {
			return PaymentType.CREDIT;
		}
		if(PaymentType.DEBIT.name().equals(paymentType)) {
			return PaymentType.DEBIT;
		}
		if(PaymentType.NETBANKING.name().equals(paymentType)) {
			return PaymentType.NETBANKING;
		}
		return null;
	}
	
	
}
