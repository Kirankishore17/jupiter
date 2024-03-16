package com.hotel.jupiter.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class GeneralManager extends Employee{
	private List<Reservation> reservations = new ArrayList<>();
	
	public GeneralManager () {
		this.role = "General_Manager";
		
		Random random = new Random(); // Create an instance of Random
		
		this.empID = random.nextInt(); // Assigns a random int value to empID
	}
	
	/*************Setters and Getters***************************/
	public List<Reservation> getReservations(){
		return reservations;
	}
	
	public void setReservations(List<Reservation> reservations){
		this.reservations = reservations;
	}
	/***********************************************************/

	
	public void viewAllReservations() {
		
		Reservation r = new Reservation();
		
		ReservationReport rr = new ReservationReport();
		
		r.setGeneralManager(this);
		
		r.setReservationReport(rr);
		
		rr.setReservation(r);
		
		List<Reservation> allReservations = r.getReservationReport().getReservationReport();
		
		// display all reservations
		System.out.println("=========================================");
		System.out.println("       Lists Of All Reservations         ");
		System.out.println("=========================================");
		System.out.println("");
		
		int i = 1;
		for (Reservation reservation : allReservations) {
			
			// Convert milliseconds to LocalDate
	        LocalDate date = Instant.ofEpochMilli(reservation.getReservationDate())
	                                .atZone(ZoneId.systemDefault())
	                                .toLocalDate();
	        
	        // Define the date format
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	        
	        // Format the LocalDate object using the formatter
	        String formattedDate = date.format(formatter);
			
			System.out.println("|-" + i);
			System.out.println("|- Reservation Date: " + formattedDate);
			System.out.println("|- Maximum Period: " + reservation.getMaxPeriod());
			System.out.println("");
			
			i++;
		}
		
		return;
	}
	
	
	public void viewActiveReservations() {
		// display all reservations
		System.out.println("=========================================");
		System.out.println("       Lists Of Active Reservations      ");
		System.out.println("=========================================");
		System.out.println("");
		
		for (int i = 1; i <= this.reservations.size(); i++) {
			Reservation reservation = this.reservations.get(i - 1);
			
			// Convert milliseconds to LocalDate
	        LocalDate date = Instant.ofEpochMilli(reservation.getReservationDate())
	                                .atZone(ZoneId.systemDefault())
	                                .toLocalDate();
	        
	        // Define the date format
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	        
	        // Format the LocalDate object using the formatter
	        String formattedDate = date.format(formatter);
			
			System.out.println("|-" + i);
			System.out.println("|- Reservation Date: " + formattedDate);
			System.out.println("|- Maximum Period: " + reservation.getMaxPeriod());
			System.out.println("");
		}
		
		return;
	}

	
	public void cancelReservation() {
		// display all reservations
		System.out.println("=========================================");
		System.out.println("          Select A Reservation           ");
		System.out.println("=========================================");
		System.out.println("");
		
		for (int i = 1; i <= this.reservations.size(); i++) {
			Reservation reservation = this.reservations.get(i - 1);
			
			// Convert milliseconds to LocalDate
	        LocalDate date = Instant.ofEpochMilli(reservation.getReservationDate())
	                                .atZone(ZoneId.systemDefault())
	                                .toLocalDate();
	        
	        // Define the date format
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	        
	        // Format the LocalDate object using the formatter
	        String formattedDate = date.format(formatter);
			
			System.out.println("|-" + i);
			System.out.println("|- Reservation Date: " + formattedDate);
			System.out.println("|- Maximum Period: " + reservation.getMaxPeriod());
			System.out.println("");
		}
		
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("|- Enter A Number Option:");
		System.out.println("");
		
		int userInput = 0;
		
		try {
		    userInput = Integer.parseInt(scanner.nextLine()); // Wait for user input
		    
		} catch (NumberFormatException e) {
			
		    System.out.println("Invalid input. Please enter a valid integer.");
		    System.out.println("");
		}
		
		while (true) {
			
		    // Check if userInput is a valid index in reservations list
		    if (userInput > 0 && userInput <= reservations.size()) {
		    	
		        break; // Valid input; exit loop
		    } else {
		    	
		        System.out.println("|- Invalid, Enter A Valid Number Option:");
		        System.out.println("");
				
				try {
				    userInput = Integer.parseInt(scanner.nextLine()); // Wait for user input
				    
				} catch (NumberFormatException e) {
					
				    System.out.println("Invalid input. Please enter a valid integer.");
				    System.out.println("");
				}
		    }
		}

        
        // retrieve reservation
        Reservation reservation =  reservations.get(userInput - 1);
        
        // set default message
        String message = "Reservation could not be cancelled";
     			
        boolean isCancelled = reservation.getCheckinManagement().cancelBooking();
		
        if(isCancelled) {
			
			// remove association between customer and reservation, since cancelled
			reservation.setCustomer(null);
			
			reservation = null;
			
			// set success message
			message = "Reservation cancelled successully";
        }

		// display message
		System.out.println("|- " + message);
		System.out.println("");
		
		return;
	}

}