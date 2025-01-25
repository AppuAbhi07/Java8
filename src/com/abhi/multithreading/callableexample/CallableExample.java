package com.abhi.multithreading.callableexample;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Submit the task
        Future<String> future = executor.submit(new MyTask());

        // Do something else while the task runs
        System.out.println("Doing other work...");

        // Get the result of the task
        String result = future.get(); // Blocks until the result is available
        System.out.println("Result: " + result);

        executor.shutdown();
    }
}
	