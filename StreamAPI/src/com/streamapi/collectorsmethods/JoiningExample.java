package com.streamapi.collectorsmethods;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoiningExample {

	public static void main(String[] args) {
		String joined = Stream.of("kodewala","Banglore").collect(Collectors.joining(", "));
		
		System.out.println(joined);
	}
}
