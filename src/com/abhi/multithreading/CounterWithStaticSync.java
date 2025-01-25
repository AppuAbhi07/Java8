package com.abhi.multithreading;

public class CounterWithStaticSync {
	
	class Counter {
	    private static int count = 0;

	    public static synchronized void increment() { // Locks the class object
	        count++;
	    }

	    public static int getCount() {
	        return count;
	    }
	    
	    
	}
	
	public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) Counter.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) Counter.increment();
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count: " + Counter.getCount());
    }

}
