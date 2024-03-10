package com.hotel.jupiter.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hotel.jupiter.AllData;

import lombok.Data;

@Data
public class OrderMenuItem {

	private Integer orderId;
	private Integer quantity;
	private String name;
	private Integer total;

	public void viewFoodItems() {
		int i;
		FoodItem data;
		for (i = 1; i <= AllData.foodList.size(); i++) {
			data = AllData.foodList.get(i - 1);
			System.out.println("|- " + i + ". " + data.getMealName());
			System.out.println("|- Type: " + data.getFoodItemType());
			System.out.println("|- Description: " + data.getMealDescription());
			System.out.println("|");
		}
	}

	public void viewDrinkItems() {
		int i;
		DrinkItem data;
		for (i = 1; i <= AllData.drinkList.size(); i++) {
			data = AllData.drinkList.get(i - 1);
			System.out.println("|- " + i + ". " + data.getMealName());
			System.out.println("|- Type: " + (data.isAlcoholic() ? "Alcoholic" : "Non-Alcoholic"));
			System.out.println("|- Description: " + data.getMealDescription());
			System.out.println("|");

		}
	}

	public void orderFoodItems(Integer id) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter you choice of food: ");
		System.out.print("=: ");
		int i = Integer.parseInt(s.nextLine());
		List<OrderMenuItem> list = AllData.customerList.get(id).getOrder();
		OrderMenuItem od = new OrderMenuItem();
		if (list == null)
			list = new ArrayList<>();
		int size = (list != null) ? list.size() : 0;
		if (i < AllData.foodList.size() && i > 0) {
			FoodItem data = AllData.foodList.get(i - 1);
			od.setOrderId(size);
			od.setQuantity(1);
			od.setTotal(0);
			od.setName(data.getMealName());
			list.add(od);
			AllData.customerList.get(id).setOrder(list);
		} else {
			System.out.println("Invalid Input");
		}
	}

	public void orderDrinkItems(Integer id) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter you choice of drink: ");
		System.out.print("=: ");
		int i = Integer.parseInt(s.nextLine());
		List<OrderMenuItem> list = AllData.customerList.get(id).getOrder();
		OrderMenuItem od = new OrderMenuItem();
		if (list == null)
			list = new ArrayList<>();
		int size = (list != null) ? list.size() : 0;
		if (i < AllData.drinkList.size() && i > 0) {
			DrinkItem data = AllData.drinkList.get(i - 1);
			od.setOrderId(size);
			od.setQuantity(1);
			od.setTotal(0);
			od.setName(data.getMealName());
			list.add(od);
			AllData.customerList.get(id).setOrder(list);
		} else {
			System.out.println("Invalid Input");
		}

	}

}
