package com.hotel.jupiter.model;

import java.util.*;

public class ReservationReport {

	Collection<Reservation> reservations;
	private Reservation[] reservationList;

	public Collection<Reservation> getReservations() {
		return this.reservations;
	}

	public void setReservations(Collection<Reservation> reservations) {
		this.reservations = reservations;
	}

	public List<Reservation> getReservationReport() {
		// TODO - implement ReservationReport.getReservationReport
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param roomID
	 */
	public Reservation getOneReservationHistoryByRoom(int roomID) {
		// TODO - implement ReservationReport.getOneReservationHistoryByRoom
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param customerID
	 */
	public Reservation getOneReservationHistoryByUser(int customerID) {
		// TODO - implement ReservationReport.getOneReservationHistoryByUser
		throw new UnsupportedOperationException();
	}

}