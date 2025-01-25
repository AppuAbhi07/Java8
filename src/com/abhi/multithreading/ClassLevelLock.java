package com.abhi.multithreading;

public class ClassLevelLock {
	
		
	public static void main(String[] args) throws InterruptedException {
		StaticCounter counter1 = new StaticCounter(); // Different objects
		StaticCounter counter2 = new StaticCounter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) StaticCounter.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) StaticCounter.increment();
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        // Static variable is shared across all objects
        System.out.println("Final Count: " + StaticCounter.getCount());
    }

}
