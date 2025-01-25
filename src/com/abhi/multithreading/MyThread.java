package com.abhi.multithreading;

public class MyThread extends Thread {

	@Override
	public void run() {

		System.out.println("Thread is running..");

	}

	public static void main(String[] args) {

		MyThread thread = new MyThread();
		System.out.println("Thread state: " + thread.getState());
		thread.start();
		System.out.println("Thread state after start: " + thread.getState());

	}

}
