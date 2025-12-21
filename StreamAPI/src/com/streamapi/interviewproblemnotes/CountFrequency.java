package com.streamapi.interviewproblemnotes;

import java.util.Map;
import java.util.stream.Collectors;

public class CountFrequency {

	public static void main(String[] args) {
		String input = "banana";
		
		Map<Object, Long> freq = input.chars()
				.mapToObj(c -> (char)c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		
		System.out.println(freq);
	}
}
