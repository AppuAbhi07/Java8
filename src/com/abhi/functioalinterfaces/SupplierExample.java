package com.abhi.functioalinterfaces;

import java.util.function.Supplier;

public class SupplierExample {
	public static void main(String[] args) {
		Supplier<Double> randomSupplier = () -> Math.random();

		System.out.println(randomSupplier.get()); // Output: (random value)
	}
}