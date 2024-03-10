package com.hotel.jupiter.model;

import lombok.Data;

@Data
public class DrinkItem extends MealOption {

	private boolean isAlcoholic;
	private double drinkAlcoholPercent;

}
