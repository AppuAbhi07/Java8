package com.abhi.java8terminaloperations;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class AverageExample {
	
	
	public static void main(String[] args) {
        OptionalDouble average = IntStream.of(1, 2, 3, 4, 5).average();

        average.ifPresent(avg -> System.out.println("Average: " + avg));
    }

}
