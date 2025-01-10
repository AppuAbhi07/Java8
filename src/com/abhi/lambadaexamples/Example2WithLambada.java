package com.abhi.lambadaexamples;

class Example2WithLambada {
	public static void main(String[] args) {
		Calculator calculator = (a, b) -> a + b;
		System.out.println(calculator.add(5, 3)); // Output: 8
	}
}