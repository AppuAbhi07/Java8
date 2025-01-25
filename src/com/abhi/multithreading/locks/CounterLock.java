package com.abhi.multithreading.locks;

import java.util.concurrent.locks.ReentrantLock;

public class CounterLock {

	private int count = 0;
	private final ReentrantLock lock = new ReentrantLock();

	public void increment() {
		lock.lock(); // Acquire the lock
		try {
			count++;
			System.out.println(Thread.currentThread().getName() + " incremented count to " + count);
		} finally {
			lock.unlock(); // Release the lock
		}
	}

	public int getCount() {
		return count;
	}

}
