package com.abhi.java8terminaloperations;

import java.util.Arrays;
import java.util.List;

public class MatchExample {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie","a");

		// Check if any name starts with 'A'
		boolean anyStartsWithA = names.stream().anyMatch(name -> name.startsWith("A"));

		// Check if all names are longer than 2 characters
		boolean allLongerThanTwo = names.stream().allMatch(name -> name.length() > 2);
		
		boolean nonMatch = names.stream().noneMatch(name -> name.length() > 2);

		System.out.println("Any starts with A: " + anyStartsWithA);
		System.out.println("All longer than 2: " + allLongerThanTwo);
		System.out.println("nonMatch: " + nonMatch);

	}
}
