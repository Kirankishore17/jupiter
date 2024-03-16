package com.hotel.jupiter.model;

import lombok.Data;

@Data
public class DrinkItem extends MealOption {

	private boolean isAlcoholic;
	private double drinkAlcoholPercent;
	
	public boolean isAlcoholic() {
		return isAlcoholic;
	}
	public void setAlcoholic(boolean isAlcoholic) {
		this.isAlcoholic = isAlcoholic;
	}
	public double getDrinkAlcoholPercent() {
		return drinkAlcoholPercent;
	}
	public void setDrinkAlcoholPercent(double drinkAlcoholPercent) {
		this.drinkAlcoholPercent = drinkAlcoholPercent;
	}

}
