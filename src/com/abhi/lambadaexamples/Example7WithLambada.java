package com.abhi.lambadaexamples;

class ExampleNoParamWithLamabada {
	public static void main(String[] args) {
		Greeter greeter = () -> System.out.println("Hello, World!");
		greeter.greet(); // Output: Hello, World!
	}
}
