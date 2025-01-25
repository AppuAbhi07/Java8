package com.abhi.optional;

import java.util.Optional;

public class First {

	public static void main(String[] args) {
		// Creating an empty Optional
		Optional<String> empty = Optional.empty();
	

		System.out.println(empty); // Output: Optional.empty

		// Creating an Optional with a non-null value
		Optional<String> nonEmpty = Optional.of("Hello");
		System.out.println(nonEmpty); // Output: Optional[Hello]

		// Creating an Optional that might hold a null value
		Optional<String> nullable = Optional.ofNullable(null);
		System.out.println(nullable); // Output: Optional.empty

		if (nonEmpty.isPresent()) {
			System.out.println(nonEmpty.get());
		} else {
			System.out.println("no value found");
		}

		String test = empty.orElse("defaultvalue");

		System.out.println(test);

	}

}
