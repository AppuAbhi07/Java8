package com.abhi.multithreading;


public class VolatileExample {
	public static void main(String[] args) throws InterruptedException {
		CounterVolatile counter = new CounterVolatile();

        // Incrementing Thread
        Thread incrementer = new Thread(() -> {
            while (counter.getCount() < 10) { // Check condition
                counter.increment(); // Increment the counter
            }
            System.out.println("Incrementer stopped at: " + counter.getCount());
        });

        // Monitoring Thread
        Thread monitor = new Thread(() -> {
            while (counter.getCount() < 10) { // Continuously monitor the counter
                // Busy-waiting for count to reach 10
            }
            System.out.println("Monitor detected count reached: " + counter.getCount());
        });

        incrementer.start();
        monitor.start();

        incrementer.join();
        monitor.join();

        System.out.println("Main thread finished.");
    }
}
