package com.rns.tiffeat.web.dao.api;

import java.util.Date;
import java.util.List;

import com.rns.tiffeat.web.dao.domain.DailyMeal;

public interface DailyMealDao {
	
	void addDailyMeal(DailyMeal dailyMeal);
	void updateDailyMeal(DailyMeal dailyMeal);
	void deleteDailyMeal(DailyMeal dailyMeal);
	List<DailyMeal> getDailyMealsForVendor(long vendorId,Date date);
	DailyMeal getDailyMealsForMeal(long mealId,Date date);
	DailyMeal getDailyMeal(long id);
}

