package com.abhi.multithreading;

public class CounterWithSync {
	
	   private int count = 0;

	    public synchronized void increment() { // Only one thread can execute this at a time
	        count++;
	    }

	    public int getCount() {
	        return count;
	    }

}
