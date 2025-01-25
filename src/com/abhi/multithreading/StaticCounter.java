package com.abhi.multithreading;

public class StaticCounter {

	private static int count = 0;

	public static synchronized void increment() { // Locks the class object
		count++;
	}

	public static int getCount() {
		return count;
	}

}
