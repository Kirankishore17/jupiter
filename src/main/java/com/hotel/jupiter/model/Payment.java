package com.hotel.jupiter.model;

public class Payment {

	CheckinManagement checkinManagement;
	private String paymentMethod;
	private boolean paymentStatus;
	private String paymentMessage;

	public CheckinManagement getCheckinManagement() {
		return this.checkinManagement;
	}

	public void setCheckinManagement(CheckinManagement checkinManagement) {
		this.checkinManagement = checkinManagement;
	}

	public void processPaymentReport() {
		// TODO - implement Payment.processPaymentReport
		throw new UnsupportedOperationException();
	}

}