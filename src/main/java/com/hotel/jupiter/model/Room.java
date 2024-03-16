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
	private Reservation reservation;

	public Integer getRoomId() {
		return roomId;
	}

	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}

	public String getRoomTitle() {
		return roomTitle;
	}

	public void setRoomTitle(String roomTitle) {
		this.roomTitle = roomTitle;
	}

	public String getRoomDescription() {
		return roomDescription;
	}

	public void setRoomDescription(String roomDescription) {
		this.roomDescription = roomDescription;
	}

	public Integer getRoomOccupancy() {
		return roomOccupancy;
	}

	public void setRoomOccupancy(Integer roomOccupancy) {
		this.roomOccupancy = roomOccupancy;
	}

	public Boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public Double getRoomPrice() {
		return roomPrice;
	}

	public void setRoomPrice(Double roomPrice) {
		this.roomPrice = roomPrice;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public void viewRoom() {
		List<Room> availableRoom = AllData.roomList.stream().filter(r -> r.getIsAvailable())
				.collect(Collectors.toList());
		for (int i = 1; i <= availableRoom.size(); i++) {
			Room r = availableRoom.get(i - 1);
			System.out.println("|--------------------------------");
			System.out.println("|---------  ID:" + r.getRoomId() +"  ---------------");
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
