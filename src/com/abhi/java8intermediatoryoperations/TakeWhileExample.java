package com.abhi.java8intermediatoryoperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TakeWhileExample {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> takenNumbers = numbers.stream().takeWhile(num -> num < 4).collect(Collectors.toList());
		System.out.println(takenNumbers); // Output: [1, 2, 3]

	}

}
