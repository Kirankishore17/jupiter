package com.hotel.jupiter.model;

public class Invoice {

	public Reservation reservation;
	public double price;
	private boolean paid;

	public Reservation getReservation() {
		return this.reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isPaid() {
		return this.paid;
	}

	public void setPaid(boolean paid) {
		this.paid = paid;
	}

	public String generateInvoice() {
		// TODO - implement Invoice.generateInvoice
		throw new UnsupportedOperationException();
	}

}