package com.streamapi.collectorsmethods;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountingExample {

	public static void main(String[] args) {
		Long count = Stream.of("a","b","c").collect(Collectors.counting());
		
		System.out.println(count);
	}
}
