package com.abhi.lambadaexamples;

class Example5withLambada {
	public static void main(String[] args) {
		MaxFinder maxFinder = (a, b) -> (a > b) ? a : b;
		System.out.println(maxFinder.findMax(10, 20)); // Output: 20
	}
}
