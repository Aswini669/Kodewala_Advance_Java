package com.streamapi.interviewproblemnotes;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWord {

	public static void main(String[] args) {
		String sentence = "Kodewala is Java Training Academy";
		
		String outPut = Arrays.stream(sentence.split(" "))
				.map(w -> new StringBuilder(w).reverse().toString())
				.collect(Collectors.joining(" "));
		
		System.out.println(outPut);
	}
}
