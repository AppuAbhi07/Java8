package com.abhi.lambadaexamples;

interface Greeter {
	void greet();
}

class GreeterImpl implements Greeter {
	@Override
	public void greet() {
		System.out.println("Hello, World!");
	}
}

class ExampleNoParam {
	public static void main(String[] args) {
		Greeter greeter = new GreeterImpl();
		greeter.greet(); // Output: Hello, World!
	}
}
