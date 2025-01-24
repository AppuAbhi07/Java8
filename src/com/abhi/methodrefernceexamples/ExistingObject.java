package com.abhi.methodrefernceexamples;

import java.util.Arrays;
import java.util.List;

public class ExistingObject {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		ExistingObject utils = new ExistingObject();

		numbers.stream().filter(utils::isEven).forEach(System.out::println);

	}

	public boolean isEven(int number) {
		return number % 2 == 0;
	}
}
