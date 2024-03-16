package com.hotel.jupiter; 

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.hotel.jupiter.model.*;

public class PaymentTest {
    
	@Test
	public void testProccessPaymentReport() {
		// Test making payment
	    Room room = new Room();
	    
		room.setIsAvailable(true);
		room.setRoomDescription("This studio is very unique located in the heart of the action on a very quiet and charming street" );
		room.setRoomId(AllData.roomList.size() + 1);
		room.setRoomNumber("500");
		room.setRoomOccupancy(3);
		room.setRoomPrice(100.00);
		room.setRoomTitle("Cozy Studio");
		
		AllData.roomList.add(room);
	    
	    Customer customer = new Customer();
	   
	    customer.setAge(20);
	    customer.setContact("12345678");
	    customer.setCustomerId(AllData.customerList.size() + 1);
	    customer.setEmail("edward@mail.com");
	    customer.setName("edward");
	    customer.setPassword("123");
	    
	    Reservation reservation = new Reservation();
	    
	    customer.setReservation(reservation);
	    customer.getReservation().setCustomer(customer);
	    
	    customer.getReservation().createReservation(room.getRoomId());
	    
	    double roomPriceDouble = room.getRoomPrice(); // Get the Double value
	    
	    int roomPrice = (int) roomPriceDouble; // Cast to integer
	    
	    CheckinManagement checkinManagement = customer.getReservation().getCheckinManagement();
	    
	    checkinManagement.setPayment(new Payment());
	    
	    checkinManagement.getPayment().setCheckinManagement(checkinManagement);
	    
	    checkinManagement.getPayment().setPaymentAmount(roomPrice);
	    
	    checkinManagement.getPayment().processPaymentReport();
	    
	    assertTrue(customer.getReservation().getCheckinManagement().getPayment().getPaymentStatus());
	}
}
