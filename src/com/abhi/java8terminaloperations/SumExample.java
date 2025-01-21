package com.abhi.java8terminaloperations;

import java.util.stream.IntStream;

public class SumExample {

	public static void main(String[] args) {
		int sum = IntStream.of(1, 2, 3, 4, 5).sum();
		System.out.println("Sum: " + sum);
	}

}
