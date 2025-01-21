package com.abhi.java8terminaloperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMaxExample {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 2, 8, 1);

		// Find the minimum number
		Optional<Integer> min = numbers.stream().min(Integer::compare);

		// Find the maximum number
		Optional<Integer> max = numbers.stream().max(Integer::compare);

		min.ifPresent(m -> System.out.println("Min: " + m));
		max.ifPresent(m -> System.out.println("Max: " + m));
	}

}
