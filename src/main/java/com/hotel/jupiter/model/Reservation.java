package com.hotel.jupiter.model;

public class Reservation {

	public Invoice invoice;
	public ReservationReport reservationReport;
	public long reservationDate;
	private int maxPeriod;
	public String reservationID;
	Room room;
	public int reservationNoOfDays;
	Customer customer;
	CheckinManagement reservation;

	public Invoice getInvoice() {
		return this.invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	public ReservationReport getReservationReport() {
		return this.reservationReport;
	}

	public void setReservationReport(ReservationReport reservationReport) {
		this.reservationReport = reservationReport;
	}

	public long getReservationDate() {
		return this.reservationDate;
	}

	public void setReservationDate(long reservationDate) {
		this.reservationDate = reservationDate;
	}

	public int getMaxPeriod() {
		return this.maxPeriod;
	}

	public void setMaxPeriod(int maxPeriod) {
		this.maxPeriod = maxPeriod;
	}

	public String getReservationID() {
		return this.reservationID;
	}

	public void setReservationID(String reservationID) {
		this.reservationID = reservationID;
	}

	/**
	 * 
	 * @param roomId
	 */
	public String createReservation(int roomId) {
		// TODO - implement Reservation.createReservation
		throw new UnsupportedOperationException();
	}

	public void addToHistoty() {
		// TODO - implement Reservation.addToHistoty
		throw new UnsupportedOperationException();
	}

}