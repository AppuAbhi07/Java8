package com.abhi.java8intermediatoryoperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

		numbers.stream().map(num -> num * num).collect(Collectors.toList()).forEach(System.out::println);

		System.out.println("===============");

		List<String> names = Arrays.asList("john", "jane", "doe");
		List<String> upperCaseNames = names.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
		System.out.println(upperCaseNames); // Output: [JOHN, JANE, DOE]

		System.out.println("===============");

		List<Integer> numbers1 = Arrays.asList(1, 2, 3);
		List<String> strings = numbers1.stream().map(num -> "Number: " + num).collect(Collectors.toList());
		System.out.println(strings); // Output: [Number: 1, Number: 2, Number: 3]

		System.out.println("===============");

	}

}
