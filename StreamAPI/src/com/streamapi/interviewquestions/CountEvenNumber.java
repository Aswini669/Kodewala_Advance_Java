package com.streamapi.interviewquestions;

import java.util.Arrays;
import java.util.List;

public class CountEvenNumber {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 3, 10, 25, 7, 8, 15, 30, 50);
		
		long outPut = numbers.stream()
				.filter(n -> n%2 == 0)
				.count();
		System.out.println(outPut);
	}
}
