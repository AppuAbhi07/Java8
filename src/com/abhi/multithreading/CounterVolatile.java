package com.abhi.multithreading;

public class CounterVolatile {

	private volatile int count = 0; // Shared variable, not volatile

    public void increment() {
        count++; // Increment the counter
    }

    public int getCount() {
        return count; // Read the counter value
    }
	
}
