package com.abhi.multithreading.threadpools;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExample {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);

        // Schedule a task to run after a delay
        scheduler.schedule(() -> {
            System.out.println("Task executed after 3 seconds delay by " + Thread.currentThread().getName());
        }, 3, TimeUnit.SECONDS);

        // Schedule a task to run periodically
        scheduler.scheduleAtFixedRate(() -> {
            System.out.println("Periodic task executed by " + Thread.currentThread().getName());
        }, 1, 2, TimeUnit.SECONDS);

        // Let the scheduler run for a while
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        scheduler.shutdown(); // Gracefully shutdown the scheduler
    }
}
