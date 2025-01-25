package com.abhi.multithreading;

public class MyRunnable implements Runnable {

	@Override
	public void run() {

		System.out.println("Thread is running..");

	}

	public static void main(String[] args) {
		Thread t = new Thread(new MyRunnable());
		t.start();
	}

}
