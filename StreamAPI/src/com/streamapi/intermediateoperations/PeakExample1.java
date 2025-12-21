package com.streamapi.intermediateoperations;

import java.util.List;

public class PeakExample1 {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5);
		
		List<Integer> outPut = numbers.stream()
				.filter(n -> n%2==0)
				.peek(n -> System.out.println("filtered value: "+ n))
				.map(e -> e*e)
				.toList();
		
		System.out.println(outPut);
	}
}
