package com.abhi.multithreading.locks;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class SharedResource {
	private final ReentrantLock lock = new ReentrantLock();
	private final Condition condition = lock.newCondition();
	private int count = 0;

	public void produce() throws InterruptedException {
		lock.lock();
		try {
			while (count > 0) {
				condition.await(); // Wait until count is 0
			}
			count++;
			System.out.println("Produced: " + count);
			condition.signalAll(); // Signal consumers
		} finally {
			lock.unlock();
		}
	}

	public void consume() throws InterruptedException {
		lock.lock();
		try {
			while (count == 0) {
				condition.await(); // Wait until count > 0
			}
			System.out.println("Consumed: " + count);
			count--;
			condition.signalAll(); // Signal producers
		} finally {
			lock.unlock();
		}
	}
}

 