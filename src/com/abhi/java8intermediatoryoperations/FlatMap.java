package com.abhi.java8intermediatoryoperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

	public static void main(String[] args) {
		List<List<Integer>> nestedLists = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5));
		List<Integer> flattened = nestedLists.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
		System.out.println(flattened); // Output: [1, 2, 3, 4, 5]
		
		String[][] array = {{"A", "B"}, {"C", "D"}, {"E"}};
		List<String> flatList = Arrays.stream(array)
		                              .flatMap(arr -> Arrays.stream(arr))
		                              .collect(Collectors.toList());
		System.out.println(flatList); // Output: [A, B, C, D, E]

		
	}

}
