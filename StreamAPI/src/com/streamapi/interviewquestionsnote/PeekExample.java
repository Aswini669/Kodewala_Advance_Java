package com.streamapi.interviewquestionsnote;

import java.util.Arrays;
import java.util.List;

public class PeekExample {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Aman", "Soumya", "Yogesh");
		
		names.stream().
				filter(n -> n.startsWith("A"))
				.peek(m -> System.out.println("After filter: "+ m))
				.map(e -> e.toUpperCase())
				.forEach(System.out::println);

	}
}
