package com.hotel.jupiter.model;

import java.util.List;
import java.util.stream.Collectors;

import com.hotel.jupiter.AllData;

import lombok.Data;

@Data
public class Room {

	private Integer roomId;
//	private List<Customer> customer;
	private String roomTitle;
	private String roomDescription;
	private Integer roomOccupancy;
	private Boolean isAvailable;
	private Double roomPrice;
	private String roomNumber;

	public void viewRoom() {
		List<Room> availableRoom = AllData.roomList.stream().filter(r -> r.getIsAvailable())
				.collect(Collectors.toList());
		for (int i = 1; i <= availableRoom.size(); i++) {
			Room r = availableRoom.get(i - 1);
			System.out.println("|--------------------------------");
			System.out.println("|---------  ID:\" + r.getRoomId() +\"  ---------------");
			System.out.println("|-- Room Title:" + r.getRoomTitle());
			System.out.println("|-- Room Description:" + r.getRoomDescription());
			System.out.println("|-- Room Occupancy:" + r.getRoomOccupancy());
			System.out.println("|-- Room Number:" + r.getRoomNumber());
			System.out.println("|-- Room Rent:" + r.getRoomPrice());
			System.out.println("|--------------------------------");
			System.out.println();
		}
	}

}
