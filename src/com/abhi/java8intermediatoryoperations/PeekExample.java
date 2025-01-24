package com.abhi.java8intermediatoryoperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PeekExample {
	
	public static void main(String[] args) {
		
		
		 List<String> names = Arrays.asList("John", "Jane", "Doe");

	        List<String> upperCaseNames = names.stream()
	                                           .peek(name -> System.out.println("Original: " + name)) // Logs original names
	                                           .map(name -> name.toUpperCase())                      // Converts to uppercase
	                                           .peek(name -> System.out.println("Uppercase: " + name)) // Logs uppercase names
	                                           .collect(Collectors.toList());

	        System.out.println(upperCaseNames); 
	        
	        
	        
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

	        List<Integer> evenNumbers = numbers.stream()
	                                           .peek(num -> System.out.println("Before filter: " + num)) // Logs all elements
	                                           .filter(num -> num % 2 == 0)                              // Filters even numbers
	                                           .peek(num -> System.out.println("After filter: " + num))  // Logs filtered elements
	                                           .collect(Collectors.toList());

	        System.out.println(evenNumbers); // Output: [2, 4]
		
	}

}
