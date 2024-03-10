package com.hotel.jupiter.model;

public class CheckinManagement {

	Payment payment;
	ReservationReport reservationReport;
	private boolean checkIn;
	private boolean checkOut;
	Reservation checkinManagement;

	public Payment getPayment() {
		return this.payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public ReservationReport getReservationReport() {
		return this.reservationReport;
	}

	public void setReservationReport(ReservationReport reservationReport) {
		this.reservationReport = reservationReport;
	}

	/**
	 * 
	 * @param customerID
	 */
	public boolean checkIn(int customerID) {
		// TODO - implement CheckinManagement.checkIn
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param customerID
	 */
	public boolean checkOut(int customerID) {
		// TODO - implement CheckinManagement.checkOut
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param reservationID
	 */
	public void generateBill(String reservationID) {
		// TODO - implement CheckinManagement.generateBill
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param userId
	 */
	public boolean cancelBooking(int userId) {
		// TODO - implement CheckinManagement.cancelBooking
		throw new UnsupportedOperationException();
	}

}