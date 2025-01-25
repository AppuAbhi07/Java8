package com.abhi.multithreading;

public class ThreadJoins {

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Thread 1: " + i);
				try {
					Thread.sleep(500); // Simulate work
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Thread 2: " + i);
				try {
					Thread.sleep(500); // Simulate work
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		t1.start();
	
		
		// Ensure t1 finishes before main thread continues
        t1.join();
        System.out.println("Thread 1 has completed.");

        // Ensure t2 finishes before main thread continues
   
    	t2.start();
        t2.join();
        System.out.println("Thread 2 has completed.");

        System.out.println("Main thread ends here.");

	}

}
