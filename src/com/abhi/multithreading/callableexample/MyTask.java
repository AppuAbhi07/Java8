package com.abhi.multithreading.callableexample;

import java.util.concurrent.Callable;

class MyTask implements Callable<String> {
    @Override
    public String call() throws Exception {
        // Simulate some work
        Thread.sleep(2000);
        return "Task completed!";
    }
}
