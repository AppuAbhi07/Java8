package com.abhi.multithreading;

class TicketBooking {
	private int tickets = 0;

	public synchronized void bookTicket(String customerName) throws InterruptedException {
		while (tickets == 0) { // Rechecks condition after being notified
			wait();
		}
		System.out.println(customerName + " booked 1 ticket.");
		tickets--;
	}

	public synchronized void addTickets(int count) throws InterruptedException {
		tickets += count;
		System.out.println("Added " + count + " tickets.");
		notifyAll(); // Notify all waiting threads
	}
}