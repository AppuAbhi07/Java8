package com.abhi.lambadaexamples;

class Example3WithLamada {
	public static void main(String[] args) {
		Checker checker = number -> number % 2 == 0;
		System.out.println(checker.isEven(4)); // true
		System.out.println(checker.isEven(5)); // false
	}
}
