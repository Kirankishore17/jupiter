package com.hotel.jupiter.model;

import java.util.List;

import com.hotel.jupiter.AllData;

import lombok.Data;

@Data
public class Customer extends Account {

	private Integer customerId;
	private List<OrderMenuItem> order;

	public void viewProfile(Integer id) {
		Customer c = AllData.customerList.get(id.intValue());
		System.out.println("Name	: " + c.getName());
		System.out.println("Email	: " + c.getEmail());
		System.out.println("Age	: " + c.getAge());
		System.out.println("Contact : " + c.getContact());

	}

	public void updateProfile(Integer customerId, Customer c) {
		Customer info = AllData.customerList.get(customerId.intValue());
		info.setAge(c.getAge());
		info.setContact(c.getContact());
		info.setName(c.getName());
		info.setEmail(c.getEmail());
		info.setCustomerId(customerId.intValue());
		AllData.customerList.remove(customerId.intValue());
		AllData.customerList.add(info);

	}

	public void viewOrders(List<OrderMenuItem> list) {
		int i;
		OrderMenuItem data;
		System.out.println("=============================");
		System.out.println("        Your Orders  ");
		System.out.println("=============================");

		for (i = 1; i <= list.size(); i++) {
			data = list.get(i - 1);
			System.out.println("|- " + i + ". " + data.getName());
			System.out.println("|- Qty: " + data.getQuantity());
			System.out.println("|");
		}

	}

}
