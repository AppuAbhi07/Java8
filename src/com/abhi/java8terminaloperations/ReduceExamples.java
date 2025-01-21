package com.abhi.java8terminaloperations;

import java.util.Arrays;
import java.util.List;

public class ReduceExamples {
	
	public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Sum of all elements
        int sum = numbers.stream()
                         .reduce(0, (a, b) -> a + b);

        System.out.println("Sum: " + sum);
        
        System.out.println("====================");
        
        // Find maximum element
        int max = numbers.stream()
                         .reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);

        System.out.println("Max: " + max);
        
        System.out.println("====================");
        
     // Find minimum element
        int min = numbers.stream()
                         .reduce(Integer.MAX_VALUE, (a, b) -> a < b ? a : b);

        System.out.println("Min: " + min);
        
        System.out.println("====================");
        // Product of all elements
        int product = numbers.stream()
                             .reduce(1, (a, b) -> a * b);

        System.out.println("Product: " + product);
        
        
        System.out.println("====================");
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

}
