package com.hotel.jupiter.model;

import java.util.List;
import java.util.stream.Collectors;

import com.hotel.jupiter.AllData;

import lombok.Data;

@Data
public class Account {

	private String name;
	private Integer age;
	private String email;
	private String contact;
	private String password;

	public int login(String user, String pass) {
		List<Customer> customers = AllData.customerList.stream()
				.filter(c -> c.getEmail().equals(user) && c.getPassword().equals(pass)).collect(Collectors.toList());
		return customers.isEmpty() ? -1 : customers.get(0).getCustomerId().intValue();
	}

	public void signUp(Customer c) {
		AllData.customerList.add(c);
		System.out.println("Customer registration successful");
	}

}
