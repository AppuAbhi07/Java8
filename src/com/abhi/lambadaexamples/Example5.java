package com.abhi.lambadaexamples;

interface MaxFinder {
	int findMax(int a, int b);
}

class MaxFinderImpl implements MaxFinder {
	@Override
	public int findMax(int a, int b) {
		return (a > b) ? a : b;
	}
}

class Example5 {
	public static void main(String[] args) {
		MaxFinder maxFinder = new MaxFinderImpl();
		System.out.println(maxFinder.findMax(10, 20)); // Output: 20
	}
}
