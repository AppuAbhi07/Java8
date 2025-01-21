package com.abhi.java8terminaloperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindExample {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

		// Find the first name starting with 'C'
		Optional<String> firstNameWithC = names.stream()
				//.filter(name -> name.startsWith("C"))
				.findFirst();

		firstNameWithC.ifPresent(System.out::println);
		
		
		System.out.println("===========================");
		
		
		// Find the first name starting with 'C'
				Optional<String> firstNameWithC1 = names.stream()
						//.filter(name -> name.startsWith("C"))
						.findAny();

				firstNameWithC1.ifPresent(System.out::println);
		
			
		
		
	}

}
