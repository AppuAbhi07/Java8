package com.abhi.java8Collectorsloperations;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectToListExample {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Bob");

		// Collect names into a List
		List<String> nameList = names.stream().collect(Collectors.toList());

		Set<String> collect = names.stream().collect(Collectors.toSet());

		System.out.println(nameList);

		System.out.println(collect);

		System.out.println("==========================");

		Map<Integer, String> map = Stream.of("one", "twos", "threes")
				.collect(Collectors.toMap(str -> str.length(), str -> str));
		System.out.println(map); // Output: {3=one, 5=three}

		System.out.println("==========================");

		Stream<String> result = Stream.of("A", "B", "C");
		String res = result.collect(Collectors.joining(","));

		System.out.println("====" + res);

		System.out.println("==========================");

		// Groups elements by string length into a map.

		Map<Integer, List<String>> grouped = Stream.of("cat", "dog", "fish", "bat")
				.collect(Collectors.groupingBy(s -> s.length()));

		System.out.println(grouped);

		System.out.println("==========================");

		Map<Boolean, List<Integer>> partitioned = Stream.of(1, 2, 3, 4, 5)
				.collect(Collectors.partitioningBy(num -> num % 2 == 0));

		System.out.println(partitioned);

		System.out.println("==========================");

		// Calculates the average of the elements.

		Double avg = Stream.of(1, 2, 3, 4).collect(Collectors.averagingInt(num -> num));
		System.out.println(avg); // Output: 2.5

		System.out.println("==========================");

		IntSummaryStatistics stats = Stream.of(1, 2, 3, 4, 5).collect(Collectors.summarizingInt(num -> num));
		System.out.println(stats);
//Output: IntSummaryStatistics{count=5, sum=15, min=1, average=3.000000, max=5}

		System.out.println("==========================");

		// Applies a mapping function to elements and collects the results.

		List<Integer> lengths = Stream.of("apple", "banana", "cherry")
				.collect(Collectors.mapping(str -> str.length(), Collectors.toList()));
		System.out.println(lengths); // Output: [5, 6, 6]
		
		
		
		  List<Integer> numbers = Arrays.asList(10, 20, 30, 40);

	        Integer totalPlusBonus = numbers.stream()
	                                        .collect(Collectors.collectingAndThen(
	                                            Collectors.summingInt(num -> num),
	                                            sum -> sum + 100 // Adds a bonus value of 100
	                                        ));

	        System.out.println(totalPlusBonus); // Output: 200

	}

}
