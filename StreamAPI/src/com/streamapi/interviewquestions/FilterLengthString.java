package com.streamapi.interviewquestions;

import java.util.Arrays;
import java.util.List;

public class FilterLengthString {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple", "Banana", "Avocado", "Mango", "Apricot", "Grapes");
		
		List<String> outPut = fruits.stream()
				.filter(l -> l.length()>5)
				.toList();
		
		System.out.println(outPut);

	}
}
