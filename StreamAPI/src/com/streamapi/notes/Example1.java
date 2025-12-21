package com.streamapi.notes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {

	public static void main(String[] args) {
		List<String> items = Arrays.asList("kodewala","Academy","Java","Spring","Stream");
		
		List<String> outPut = items.stream()
				.filter(n -> n.length()>5)
				.map(u -> u.toUpperCase())
				.sorted()
				.collect(Collectors.toList());
		
		//print the result
		outPut.forEach(System.out::println);
		
		System.out.println("Parallel Stream Output: ");
		items.parallelStream().forEach(item -> System.out.println(Thread.currentThread().getName() + " - " + item));
	}
}
