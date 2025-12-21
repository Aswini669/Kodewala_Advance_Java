package com.streamapi.notes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ForEachExample {

	public static void main(String[] args) {
		List<String> items = Arrays.asList("kodewala","Academy","Banglore");
		
		Stream<String> stream = items.stream();
		
		//stream.forEach(System.out::println);
		
		stream.forEach(item -> System.out.println(item));
	}
}
