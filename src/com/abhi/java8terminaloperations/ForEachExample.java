package com.abhi.java8terminaloperations;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

		// Print each name
		names.stream().forEach(t->System.out.println(t));
		
		
		System.out.println("================================");
		
		////
		
		List<String> data = Arrays.asList("100", "200", "Invalid", "300");

        // Process each element, handling exceptions
        data.stream()
            .forEach(item -> {
                try {
                    int number = Integer.parseInt(item);
                    System.out.println("Parsed: " + number);
                } catch (NumberFormatException e) {
                    System.out.println("Error parsing: " + item);
                }
            });
        
        
        System.out.println("================================");
        
        
        
        Map<String, Integer> items = new HashMap<>();
        items.put("Apple", 2);
        items.put("Banana", 5);
        items.put("Orange", 3);

        // Print each key-value pair
        items.entrySet().stream()
             .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
	
	
	
        System.out.println("================================");
        
        
	
	
	
	
	}
}
