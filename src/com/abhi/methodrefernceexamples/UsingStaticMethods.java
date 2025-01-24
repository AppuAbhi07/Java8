package com.abhi.methodrefernceexamples;

import java.util.Arrays;
import java.util.List;

public class UsingStaticMethods {

	public static void main(String[] args) {

		List<String> numbers = Arrays.asList("1", "2", "3", "4");

		List<Integer> intNumbers = numbers.stream().map(Integer::parseInt) // Static method reference
				.toList();

		System.out.println(intNumbers); // Output: [1, 2, 3, 4]

		List<String> words = Arrays.asList("hello", "world");

		words.stream().map(UsingStaticMethods::toUpperCase).forEach(System.out::println);

		System.out.println("===================================");

		StringBuilder sb = new StringBuilder();
		words.stream().forEach(sb::append);
		
		System.out.println(sb);
		
		System.out.println("===================================");

		
		
		
		
		
		

	}

	public static String toUpperCase(String str) {
		return str.toUpperCase();
	}
	
	
	

}
