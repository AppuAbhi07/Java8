package com.abhi.java8intermediatoryoperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortExamples {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(5, 3, 1, 4, 2);
		List<Integer> sortedNumbers = numbers.stream()
		                                     .sorted()
		                                     .collect(Collectors.toList());
		System.out.println(sortedNumbers); // Output: [1, 2, 3, 4, 5]
		
		System.out.println("============================");
		
		List<String> names = Arrays.asList("John", "Jane", "Doe");
		List<String> sortedByLength = names.stream()
		                                   .sorted((a, b) -> a.length() - b.length())
		                                   .collect(Collectors.toList());
		System.out.println(sortedByLength); // Output: [Doe, John, Jane]


	}

}
