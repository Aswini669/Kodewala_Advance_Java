package com.streamapi.interviewquestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestWord {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("java", "programming", "stream", "api", "development");
		
		String longest = words.stream()
				.max(Comparator.comparingInt(e -> e.length()))
				.orElse("no words found");
		
		System.out.println(longest);
	}
}
