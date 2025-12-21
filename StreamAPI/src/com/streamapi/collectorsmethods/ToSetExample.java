package com.streamapi.collectorsmethods;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToSetExample {

	public static void main(String[] args) {
		Set<String> set = Stream.of("a","b","c","d").collect(Collectors.toSet());
		
		System.out.println(set);
	}
}
