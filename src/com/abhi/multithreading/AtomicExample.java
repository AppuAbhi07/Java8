package com.abhi.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {
	
	private AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        count.incrementAndGet(); // Thread-safe increment
    }

    public int getCount() {
        return count.get(); // Get the current value
    }

}
