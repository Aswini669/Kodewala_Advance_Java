package com.streamapi.interviewquestionsnote;

import java.util.Arrays;
import java.util.List;

public class StreamChainExample {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Ankit", "Amit", "John");
		
		List<String> outPut = names.stream()
				.filter(n -> n.startsWith("A"))
				.filter(l -> l.length()>3)
				.map(u -> u.toUpperCase())
				.map(s -> "Name: "+ s)
				.toList();
		
		System.out.println(outPut);
	}
}
