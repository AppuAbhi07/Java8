package com.abhi.java8Collectorsloperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectToListExample {
	
	
	public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Collect names into a List
        List<String> nameList = names.stream()
                                     .collect(Collectors.toList());

        System.out.println(nameList);
    }

}
