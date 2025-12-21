package com.streamapi.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapWordsExample {

	public static void main(String[] args) {
		List<String> sentences = Arrays.asList(
                "I love Java",
                "Stream API is powerful",
                "FlatMap is useful"
        );
		
		System.out.println("input: "+ sentences);
		
		List<String> words = sentences.stream().flatMap(s -> Arrays.stream(s.split(" "))).collect(Collectors.toList());
		
		System.out.println("words: "+ words);
	}
}
