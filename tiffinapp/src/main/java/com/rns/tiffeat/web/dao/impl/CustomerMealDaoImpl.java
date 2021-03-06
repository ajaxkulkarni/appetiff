
package com.rns.tiffeat.web.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.rns.tiffeat.web.bo.domain.MealFormat;
import com.rns.tiffeat.web.bo.domain.MealType;
import com.rns.tiffeat.web.dao.api.CustomerMealDao;
import com.rns.tiffeat.web.dao.domain.CustomerMeal;

public class CustomerMealDaoImpl implements CustomerMealDao {

	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void addCustomerMeal(CustomerMeal meal) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.merge(meal);
		tx.commit();
		session.close();
	}

	public List<CustomerMeal> getScheduledMeals(long customerId) {
		List<CustomerMeal> scheduledMeals = new ArrayList<CustomerMeal>();
		Session session = this.sessionFactory.openSession();
		Query createQuery = session.createQuery("from CustomerMeal where customer.id=:id AND format=:scheduled");
		createQuery.setLong("id", customerId);
		createQuery.setString("scheduled", MealFormat.SCHEDULED.name());
		scheduledMeals = createQuery.list();
		session.close();
		return scheduledMeals;
	}

	
	public CustomerMeal getLastQuickOrder(long customerId) {
		List<CustomerMeal> quickOrders = new ArrayList<CustomerMeal>();
		Session session = this.sessionFactory.openSession();
		Query createQuery = session.createQuery("from CustomerMeal where customer.id=:id AND format=:quick ORDER BY date DESC");
		createQuery.setLong("id", customerId);
		createQuery.setString("quick", MealFormat.QUICK.name());
		quickOrders = createQuery.list();
		session.close();
		if(CollectionUtils.isEmpty(quickOrders)) {
			return null;
		}
		return quickOrders.get(0);
	}
	
	public List<CustomerMeal> getQuickOrdersByDate(long customerId,Date date) {
		List<CustomerMeal> quickOrders = new ArrayList<CustomerMeal>();
		Session session = this.sessionFactory.openSession();
		Query createQuery = session.createQuery("from CustomerMeal where customer.id=:id AND format=:quick AND date>=:date");
		createQuery.setLong("id", customerId);
		createQuery.setString("quick", MealFormat.QUICK.name());
		createQuery.setDate("date", date);
		quickOrders = createQuery.list();
		session.close();
		return quickOrders;
	}
	
	public List<CustomerMeal> getPreviousQuickOrders(long customerId) {
		List<CustomerMeal> quickOrders = new ArrayList<CustomerMeal>();
		Session session = this.sessionFactory.openSession();
		Query createQuery = session.createQuery("from CustomerMeal where customer.id=:id AND format=:quick AND date<:date ORDER BY date DESC");
		createQuery.setLong("id", customerId);
		createQuery.setString("quick", MealFormat.QUICK.name());
		createQuery.setDate("date", new Date());
		createQuery.setMaxResults(5);
		quickOrders = createQuery.list();
		session.close();
		return quickOrders;
	}

	public List<CustomerMeal> getScheduledMealsForVendor(long vendorId) {
		List<CustomerMeal> orders = new ArrayList<CustomerMeal>();
		Session session = this.sessionFactory.openSession();
		Query createQuery = session.createQuery("from CustomerMeal where meal.vendor.id=:id AND format=:scheduled");
		createQuery.setLong("id", vendorId);
		createQuery.setString("scheduled", MealFormat.SCHEDULED.name());
		orders = createQuery.list();
		session.close();
		return orders;
	}

	public void editCustomerMeal(CustomerMeal meal) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(meal);
		tx.commit();
		session.close();
	}

	public CustomerMeal getCustomerMeal(long customerMealId) {
		List<CustomerMeal> orders = new ArrayList<CustomerMeal>();
		Session session = this.sessionFactory.openSession();
		Query createQuery = session.createQuery("from CustomerMeal where id=:meal_id");
		createQuery.setLong("meal_id", customerMealId);
		orders = createQuery.list();
		session.close();
		if(CollectionUtils.isEmpty(orders)) {
			return null;
		}
		return orders.get(0);
	}

	public List<CustomerMeal> getScheduledMealsForMeal(long mealId,MealType type) {
		List<CustomerMeal> meals = new ArrayList<CustomerMeal>();
		Session session = this.sessionFactory.openSession();
		Query createQuery = session.createQuery("from CustomerMeal where meal.id=:meal_id AND format=:scheduled AND mealType=:type");
		createQuery.setLong("meal_id", mealId);
		createQuery.setString("scheduled", MealFormat.SCHEDULED.name());
		createQuery.setString("type", type.name());
		meals = createQuery.list();
		for(CustomerMeal meal:meals) {
			meal.getOrders();
		}
		session.close();
		return meals;
	}

	public void addCustomerMeals(List<CustomerMeal> customerMealsToBeAdded) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		for(CustomerMeal meal:customerMealsToBeAdded) {
			session.merge(meal);
		}
		tx.commit();
		session.close();
	}

}
