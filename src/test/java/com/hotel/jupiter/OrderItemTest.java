package com.hotel.jupiter;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

import com.hotel.jupiter.model.Customer;
import com.hotel.jupiter.model.DrinkItem;
import com.hotel.jupiter.model.FoodItem;
import com.hotel.jupiter.model.OrderMenuItem;

class OrderItemTest {

    @Test
    public void testViewFoodItems() {
    	FoodItem f1 = new FoodItem();
		f1.setFoodItemType("appetizer");
		f1.setMealName("samosa");
		f1.setMealId(0);
		f1.setMealDescription("A folded pastry stuffed with potato, peas and spices");
		AllData.foodList.add(f1);

        OrderMenuItem menu = new OrderMenuItem();
        menu.viewFoodItems();
   }

    @Test
    public void testViewDrinkItems() {
    	DrinkItem f1 = new DrinkItem();
		f1.setMealName("wine");
		f1.setMealId(0);
		f1.setMealDescription("wine");
		f1.setAlcoholic(true);
		AllData.drinkList.add(f1);
        OrderMenuItem menu = new OrderMenuItem();

        menu.viewDrinkItems();
    }

    @Test
    public void testOrderFoodItems() {
		Customer c1 = new Customer();
		c1.setAge(20);
		c1.setContact("55566669999");
		c1.setCustomerId(AllData.customerList.size());
		c1.setEmail("kk");
		c1.setName("priya");
		c1.setPassword("kk");
        AllData.customerList.add(c1);


        Customer c = AllData.customerList.get(0);
    	FoodItem f1 = new FoodItem();
		f1.setFoodItemType("appetizer");
		f1.setMealName("samosa");
		f1.setMealId(0);
		f1.setMealDescription("A folded pastry stuffed with potato, peas and spices");
        AllData.foodList.add(f1);
        OrderMenuItem menu = new OrderMenuItem();
        menu.orderFoodItems(c.getCustomerId());
        assertFalse(c.getOrder().isEmpty());
    }

    @Test
    public void testOrderDrinkItems() {
		DrinkItem d3 = new DrinkItem();
		d3.setMealName("Mango Lassi");
		d3.setMealId(2);
		d3.setMealDescription("A creamy yogurt-based drink blended with ripe mangoes and spices.");
		d3.setAlcoholic(false);
		d3.setDrinkAlcoholPercent(0.0);
		AllData.drinkList.add(d3);
		Customer c1 = new Customer();
		c1.setAge(20);
		c1.setContact("55566669999");
		c1.setCustomerId(AllData.customerList.size());
		c1.setEmail("kk");
		c1.setName("priya");
		c1.setPassword("kk");
        AllData.customerList.add(c1);

        Customer c = AllData.customerList.get(0);
    	DrinkItem f1 = new DrinkItem();
		f1.setMealName("samosa");
		f1.setMealId(0);
		f1.setMealDescription("A folded pastry stuffed with potato, peas and spices");
        AllData.drinkList.add(f1);
        OrderMenuItem menu = new OrderMenuItem();
        menu.orderFoodItems(c.getCustomerId());
        assertFalse(c.getOrder().isEmpty());
    }


}
