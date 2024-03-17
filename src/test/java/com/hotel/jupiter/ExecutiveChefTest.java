package com.hotel.jupiter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.hotel.jupiter.model.Customer;
import com.hotel.jupiter.model.DrinkItem;
import com.hotel.jupiter.model.ExecutiveChef;
import com.hotel.jupiter.model.FoodItem;

class ExecutiveChefTest {

	@Test
	public void testCreateFoodItem() {
		FoodItem menuItem = new FoodItem();
		menuItem.setMealName("bread");
		menuItem.setMealId(333);
		menuItem.setMealDescription("baked fresh");
		menuItem.setFoodItemType("pastry");
		assertFalse(AllData.foodList.contains(menuItem));
		ExecutiveChef chef = new ExecutiveChef();
		chef.createFoodItem(menuItem);
		assertTrue(AllData.foodList.contains(menuItem));
	}

	@Test
	public void testCreateDrinkItem() {
		DrinkItem item = new DrinkItem();
		item.setMealName("coke");
		item.setMealId(333);
		item.setMealDescription("coke");
		item.setAlcoholic(true);
		item.setDrinkAlcoholPercent(10);
		assertFalse(AllData.drinkList.contains(item));
		ExecutiveChef chef = new ExecutiveChef();
		chef.createDrinkItem(item);
		assertTrue(AllData.drinkList.contains(item));
	}

	@Test
	public void testDeleteFoodItem() {
		FoodItem menuItem = new FoodItem();
		menuItem.setMealName("cake");
		menuItem.setMealId(335);
		menuItem.setMealDescription("baked fresh");
		menuItem.setFoodItemType("cake");
		ExecutiveChef chef = new ExecutiveChef();
		chef.createFoodItem(menuItem);
		assertTrue(AllData.foodList.contains(menuItem));
		chef.deleteFoodItem(menuItem.getMealId());
		assertFalse(AllData.foodList.contains(menuItem));

	}

	@Test
	public void testDeleteDrinkItem() {
		DrinkItem item = new DrinkItem();
		item.setMealName("sprite");
		item.setMealId(330);
		item.setMealDescription("sprite");
		item.setAlcoholic(true);
		item.setDrinkAlcoholPercent(15.3);
		ExecutiveChef chef = new ExecutiveChef();
		chef.createDrinkItem(item);
		assertTrue(AllData.drinkList.contains(item));
		chef.deleteDrinkItem(item.getMealId());
		assertFalse(AllData.drinkList.contains(item));

	}
	
    @Test
    public void testUpdateFoodItem() {
    	
		FoodItem menuItem = new FoodItem();
		menuItem.setMealName("testupdatefood");
		menuItem.setMealId(444);
		menuItem.setMealDescription("testupdatefood");
		menuItem.setFoodItemType("testupdatefood");
        ExecutiveChef chef = new ExecutiveChef();
        chef.createFoodItem(menuItem);
        assertTrue(AllData.foodList.contains(menuItem));
		FoodItem newItem = new FoodItem();
		newItem.setMealName("testupdatefood");
		newItem.setMealId(444);
		newItem.setMealDescription("testupdatefood");
		newItem.setFoodItemType("testupdatefood");
		FoodItem result = AllData.foodList.stream().filter(x->x.getMealId()==menuItem.getMealId()).findFirst().orElse(null);
        int i = newItem.getCustomerId().intValue();
        assertEquals(c2.getName(), AllData.customerList.get(i).getName());
        assertEquals(c2.getEmail(), AllData.customerList.get(i).getEmail());
        assertEquals(c2.getAge(), AllData.customerList.get(i).getAge());
        assertEquals(c2.getContact(), AllData.customerList.get(i).getContact());
    }


}
