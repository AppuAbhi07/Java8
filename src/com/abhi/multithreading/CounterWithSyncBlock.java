package com.abhi.multithreading;

public class CounterWithSyncBlock {
	
    private int count = 0;

    public void increment() {
        synchronized (this) { // Synchronize only this critical section
            count++;
        }
    }

    public int getCount() {
        return count;
    }

}
