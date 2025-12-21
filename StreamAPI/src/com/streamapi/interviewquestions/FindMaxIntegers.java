package com.streamapi.interviewquestions;

import java.util.Arrays;
import java.util.List;

public class FindMaxIntegers {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, -3, 10, 25, -7, 0, 8, -15, 30, 50);
		
		Integer outPut = numbers.stream()
				.max(Integer :: compareTo)
				.get();
		
		System.out.println(outPut);
	}
}
