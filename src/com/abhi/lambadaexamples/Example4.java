package com.abhi.lambadaexamples;

interface Multiplier {
	int multiply(int a, int b);
}

class MultiplierImpl implements Multiplier {
	@Override
	public int multiply(int a, int b) {
		return a * b;
	}
}

class Example4 {
	public static void main(String[] args) {
		Multiplier multiplier = new MultiplierImpl();
		System.out.println(multiplier.multiply(4, 3)); // Output: 12
	}
}
