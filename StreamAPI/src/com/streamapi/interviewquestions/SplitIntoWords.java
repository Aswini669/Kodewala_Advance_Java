package com.streamapi.interviewquestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SplitIntoWords {

	public static void main(String[] args) {
		List<String> sentence = Arrays.asList("java is platform independent language", "stream make life easier",
				"practice make perfect");
		
		Stream<String> stream = sentence.stream();
		//For each sentence (s), split it by spaces → s.split(" ") gives an array of words.
		List<String> words = stream.flatMap(s -> Arrays.stream(s.split(" "))).toList();
		
		System.out.println(words);
	}
}
