package com.abhi.lambadaexamples;

interface Calculator {
	int add(int a, int b);
}

class CalculatorImpl implements Calculator {
	@Override
	public int add(int a, int b) {
		return a + b;
	}
}

public class Example2 {
	public static void main(String[] args) {
		Calculator calculator = new CalculatorImpl();
		System.out.println(calculator.add(5, 3)); // Output: 8
	}

}
