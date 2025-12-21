package com.streamapi.interviewquestions;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueCharacters {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("java", "stream", "api","process");
		
		Set<Character> uniqueCharacters = words.stream()
				.flatMap(str -> str.chars().mapToObj(c -> (char)c))
				.collect(Collectors.toSet());
		
		System.out.println(uniqueCharacters);
		
	}
}
