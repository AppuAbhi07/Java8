package com.abhi.multithreading;

public class ObjectLevelLock {

	public static void main(String[] args) throws InterruptedException {

		CounterWithSync counter1 = new CounterWithSync();
		CounterWithSync counter2 = new CounterWithSync();

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 1000; i++)
				counter1.increment();
		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 1000; i++)
				counter2.increment();
		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		// Each counter operates independently
		System.out.println("Counter 1: " + counter1.getCount());
		System.out.println("Counter 2: " + counter2.getCount());
	}

}
