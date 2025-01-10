package com.abhi.lambadaexamples;

class Example4Lambada {
	public static void main(String[] args) {
		Multiplier multiplier = (a, b) -> a * b;
		System.out.println(multiplier.multiply(4, 3)); // Output: 12
	}
}
