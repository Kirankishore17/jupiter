package com.hotel.jupiter.model;

import java.util.Scanner;

import com.hotel.jupiter.AllData;

public class ExecutiveChef extends Employee {

	MealOption mealOption;

	/**
	 * 
	 * @param menuItem
	 */
	public void createFoodItem(FoodItem menuItem) {
		AllData.foodList.add(menuItem);
	}

	/**
	 * 
	 * @param menuItemID
	 */
	public void deleteFoodItem(int menuItemID) {
		// TODO - implement ExecutiveChef.deleteMenuItem
		FoodItem food = AllData.foodList.stream().filter(r1 -> r1.getMealId() == menuItemID).findFirst().orElse(null);
		if (food != null) {
			int v = AllData.foodList.indexOf(food);
			AllData.foodList.remove(v);
		} else {
			System.out.println("This ID does not exist!!");
		}
	}

	/**
	 * 
	 * @param menuItemID
	 */
	public void updateFoodItem(Integer menuItemID) {
		FoodItem food = AllData.foodList.stream().filter(x -> x.getMealId() == menuItemID).findFirst().orElse(null);
		if( food != null) {
			Scanner s = new Scanner(System.in);
			FoodItem item = new FoodItem();
			System.out.println("Food Name: ");
			item.setMealName(s.nextLine());
			System.out.println("Food Type (Appetizer / Main / Dessert) : ");
			item.setFoodItemType(s.nextLine());
			System.out.println("Description: ");
			item.setMealDescription(s.nextLine());
			item.setMealId(menuItemID);
			int id = AllData.foodList.indexOf(food);
			AllData.foodList.remove(id);
			AllData.foodList.add(item);	
			s.close();
		}
	}

	
	public void viewAllFoodItems() {
		OrderMenuItem od = new OrderMenuItem();
		od.viewFoodItems();
	}
	
	public void createDrinkItem(DrinkItem menuItem) {
		AllData.drinkList.add(menuItem);
	}

	/**
	 * 
	 * @param menuItemID
	 */
	public void deleteDrinkItem(int menuItemID) {
		// TODO - implement ExecutiveChef.deleteMenuItem
		DrinkItem drink = AllData.drinkList.stream().filter(r1 -> r1.getMealId() == menuItemID).findFirst().orElse(null);
		if (drink != null) {
			int v = AllData.drinkList.indexOf(drink);
			AllData.drinkList.remove(v);
		} else {
			System.out.println("This ID does not exist!!");
		}
	}

	/**
	 * 
	 * @param menuItemID
	 */
	public void updateDrinkItem(Integer menuItemID) {
		DrinkItem food = AllData.drinkList.stream().filter(x -> x.getMealId() == menuItemID).findFirst().orElse(null);
		if( food != null) {
			Scanner s = new Scanner(System.in);
			DrinkItem item = new DrinkItem();
			System.out.println("Drink Name: ");
			item.setMealName(s.nextLine());
			System.out.println("Drink Description");
			item.setMealDescription(s.nextLine());
			System.out.println("Is Alcoholic (true /false) :");
			item.setAlcoholic(s.nextBoolean());
			System.out.println("Alcohol percentage (0 if non-alcoholic) :");
			item.setDrinkAlcoholPercent(s.nextDouble());
			item.setMealId(menuItemID);
			int id = AllData.drinkList.indexOf(food);
			AllData.drinkList.remove(id);
			AllData.drinkList.add(item);
			s.close();
		}
	}

	
	public void viewAllDrinkItems() {
		OrderMenuItem od = new OrderMenuItem();
		od.viewDrinkItems();;
	}
	
	
	
	

}