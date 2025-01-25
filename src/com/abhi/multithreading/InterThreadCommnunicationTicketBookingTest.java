package com.abhi.multithreading;

public class InterThreadCommnunicationTicketBookingTest {

	public static void main(String[] args) {
		TicketBooking bookingSystem = new TicketBooking();

		Thread producer = new Thread(() -> {
			try {
				bookingSystem.addTickets(1); // Add 1 ticket
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		Thread consumer1 = new Thread(() -> {
			try {
				bookingSystem.bookTicket("Customer1");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		Thread consumer2 = new Thread(() -> {
			try {
				bookingSystem.bookTicket("Customer2");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		consumer1.start();
		consumer2.start();
		producer.start();
	}
}
