package com.abhi.multithreading;

public class CounterWithoutSync {
	
	public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Create two threads that increment the counter
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        // Expected count is 2000, but due to race condition, the result will vary
        System.out.println("Final Count: " + counter.getCount());
    }

}
