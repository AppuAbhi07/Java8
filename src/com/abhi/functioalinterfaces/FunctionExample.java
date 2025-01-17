package com.abhi.functioalinterfaces;

import java.util.function.Function;

public class FunctionExample {
	public static void main(String[] args) {
		Function<String, Integer> stringLength = str -> str.length();

		System.out.println(stringLength.apply("Hello")); // Output: 5
	}
}
