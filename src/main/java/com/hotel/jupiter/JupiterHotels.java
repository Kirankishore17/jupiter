package com.hotel.jupiter;

import java.util.Scanner;

import com.hotel.jupiter.model.Account;
import com.hotel.jupiter.model.Customer;
import com.hotel.jupiter.model.OrderMenuItem;
import com.hotel.jupiter.model.Room;

public class JupiterHotels {

	public static void main(String args[]) {
		System.out.println("=============================");
		System.out.println("  Welcome to Jupiter Hotels  ");
		System.out.println("=============================");
		Scanner s = new Scanner(System.in);
		AllData.setUp();
		while (true) {
			System.out.println("\n---------Choose----------");
			System.out.print("1. Login \n2. Sign up\n--> ");
			int i = Integer.parseInt(s.nextLine());
			switch (i) {
			case 1:
				System.out.print("Enter username: ");
				String user = s.nextLine();
				System.out.print("Enter password: ");
				String pass = s.nextLine();
				Account a = new Account();
				int id = a.login(user,pass);
				if (id != -1) {
					System.out.println("==> Login Successful <==");
					successfullyLoggedin(id);
				} else
					System.out.println("--Login Unsuccessful--");
				break;
			case 2:
				System.out.println("Please provide the following details:");
				Customer c = new Customer();
				System.out.println("Name");
				c.setName(s.nextLine());
				System.out.println("Email (username): ");
				c.setEmail(s.nextLine());
				System.out.println("Password: ");
				c.setPassword(s.nextLine());
				c.setCustomerId(AllData.customerList.size());
				System.out.println("Age: ");
				c.setAge(Integer.parseInt(s.nextLine()));
				System.out.println("Contact number: ");
				c.setContact(s.nextLine());
				Account a2 = new Account();
				a2.signUp(c);
				break;
			}
		}
	}
	

	private static void successfullyLoggedin(int id) {
		while (true) {
			System.out.println("=============================");
			System.out.println("  Welcome to Jupiter Hotels  ");
			System.out.println("  1. View Profile  ");
			System.out.println("  2. Update Profile  ");
			System.out.println("  3. View Rooms  ");
			System.out.println("  4. Reservation Section ");
			System.out.println("  5. Log Out  ");
			System.out.println("  6. Order Food  ");
			System.out.println("=============================");
			Scanner s = new Scanner(System.in);
			boolean flag = false;
			System.out.println("Your choice: ");
			String i = s.nextLine();
			switch (i) {
			case "1":
				Customer c1 = new Customer();
				c1.viewProfile(id);
				break;
			case "2":
				System.out.println("Please provide the following details:");
				Customer c = new Customer();
				System.out.println("Name");
				c.setName(s.nextLine());
				System.out.println("Email (username): ");
				c.setEmail(s.nextLine());
				System.out.println("Age: ");
				c.setAge(Integer.parseInt(s.nextLine()));
				System.out.println("Contact number: ");
				c.setContact(s.nextLine());
				c.updateProfile(id, c);
				break;
			case "3":
				Room r = new Room();
				r.viewRoom();
				break;
			case "4":
				reservationSection(id);
				break;
			case "5":
				flag = true;
				break;
			case "6":
				foodArea(id);
				break;
				
			}
			if(flag==true) {
				System.out.println("Successfully Loggedout");
				break;
			}
		}

	}
	

	private static void foodArea(Integer id) {
		System.out.println("=============================");
		System.out.println("  Welcome to Jupiter Hotels  ");
		System.out.println("=============================");
		System.out.println("Food Options:");
		Scanner s = new Scanner(System.in);
		OrderMenuItem order = new OrderMenuItem();
		System.out.println("|- 1. View Food  ");
		System.out.println("|- 2. Order Food  ");
		System.out.println("|- 3. View Drink  ");
		System.out.println("|- 4. Order Drink  ");
		System.out.println("|- 5. View Orders  ");
		System.out.println("|--> ");
		int b = Integer.parseInt(s.nextLine());
		switch(b) {
		case 1:
			order.viewFoodItems();
			break;
		case 2:
			order.orderFoodItems(id);
			break;
		case 3:
			order.viewDrinkItems();
			break;
		case 4:
			order.orderDrinkItems(id);
			break;
		case 5:
			Customer cu = AllData.customerList.get(id);
			cu.viewOrders(cu.getOrder());
			break;
		}
	}
	
	
	private static void reservationSection(int id) {
		boolean navigateBack = false;
		
		while(!navigateBack) {
			
			Customer c = AllData.customerList.stream()
	        		.filter(cu -> cu.getCustomerId() == id).findFirst()
	                .orElse(null);
			
			System.out.println("=============================");
			System.out.println("  Welcome to Jupiter Hotels  ");
			System.out.println("=============================");
			System.out.println("");
			System.out.println("Select An Option:");
			System.out.println("|- 1. Make Reservation    ");
			System.out.println("|- 2. Cancel Reservation  ");
			System.out.println("|- 3. Check In            ");
			System.out.println("|- 4. Check Out           ");
			System.out.println("|- 5. Make Payment        ");
			System.out.println("|- 6. Return to Main Menu ");
			System.out.println("|--> ");
			
			@SuppressWarnings("resource")
			Scanner s = new Scanner(System.in);
			int b = Integer.parseInt(s.nextLine());
			
			switch(b) {
			case 1:
				c.makeReservation();
				break;
			case 2:
				c.cancelReservation();
				break;
			case 3:
				c.checkIn();
				break;
			case 4:
				c.checkOut();
				break;
			case 5:
				c.makePayment();
				break;
			case 6:
				navigateBack = true;
				break;
			}
			
		}
		
	}
}
