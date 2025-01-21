package com.abhi.java8terminaloperations;

import java.util.Arrays;
import java.util.List;

public class CountExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Count names longer than 3 characters
        long count = names.stream()
                          //.filter(name -> name.length() > 3)
                          .count();

        System.out.println("Count: " + count);
    }
}
