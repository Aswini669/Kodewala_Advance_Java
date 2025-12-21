package com.streamapi.interviewproblemnotes;

import java.util.Arrays;
import java.util.List;

public class ReverseEachWordFromList {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("Kodewala", "is", "Java", "Training", "Academy");
		
		List<String> outPut = words.stream()
				.map(w -> new StringBuilder(w).reverse().toString())
				.toList();
		
		System.out.println(outPut);
	}
}
