package com.hotel.jupiter.model;

import lombok.Data;

@Data
public class FoodItem extends MealOption {

	private String foodItemType;

	public String getFoodItemType() {
		return foodItemType;
	}

	public void setFoodItemType(String foodItemType) {
		this.foodItemType = foodItemType;
	}

}
