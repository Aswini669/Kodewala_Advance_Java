package com.streamapi.interviewquestions;

import java.util.Arrays;
import java.util.List;

public class ParitionEvenOdd1 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		List<Integer> evenNumbers = numbers.stream().filter(e -> e%2 == 0).toList();
		
		List<Integer> oddNumbers = numbers.stream().filter(n -> n%2 != 0).toList();
		
		System.out.println(evenNumbers);
		System.out.println(oddNumbers);
	}
}
