package com.hotel.jupiter.model;

public class Admin extends Account {

	public int id;
	public String name;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @param branchID
	 */
	public void assignGeneralManager(int branchID) {
		// TODO - implement Admin.assignGeneralManager
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param branchID
	 */
	public void assignExecutiveChef(int branchID) {
		// TODO - implement Admin.assignExecutiveChef
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param empID
	 */
	public void deleteEmployee(int empID) {
		// TODO - implement Admin.deleteEmployee
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param empID
	 */
	public void updateEmployee(int empID) {
		// TODO - implement Admin.updateEmployee
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param employee
	 */
	public void addEmployee(Employee employee) {
		// TODO - implement Admin.addEmployee
		throw new UnsupportedOperationException();
	}

	public void createRoom() {
		// TODO - implement Admin.createRoom
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param roomID
	 */
	public void deleteRoom(String roomID) {
		// TODO - implement Admin.deleteRoom
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param roomID
	 */
	public void updateRoom(String roomID) {
		// TODO - implement Admin.updateRoom
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param roomID
	 */
	public void viewRoomDetails(String roomID) {
		// TODO - implement Admin.viewRoomDetails
		throw new UnsupportedOperationException();
	}

}