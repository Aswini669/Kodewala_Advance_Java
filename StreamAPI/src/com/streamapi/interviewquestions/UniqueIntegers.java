package com.streamapi.interviewquestions;

import java.util.Arrays;
import java.util.List;

public class UniqueIntegers {

	public static void main(String[] args) {
		List<List<Integer>> numbers = Arrays.asList(Arrays.asList(1, 5, 6, 3, 20), Arrays.asList(2, 7, 9, 6, 2, 3, 42),
				Arrays.asList(20, 54, 3, 5, 4, 2, 3, 20));
		
		List<Integer> results = numbers.stream().flatMap(s -> s.stream()).distinct().toList();
		System.out.println("unique integers: "+ results);
	}
}
