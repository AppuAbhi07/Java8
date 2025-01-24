package com.abhi.java8intermediatoryoperations;

import java.util.Arrays;
import java.util.List;

public class ParallelExample {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		numbers.stream().parallel()
				.forEach(num -> System.out.println(Thread.currentThread().getName() + " processed " + num));

	}

}
