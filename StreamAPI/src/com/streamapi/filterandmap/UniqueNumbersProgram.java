package com.streamapi.filterandmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UniqueNumbersProgram {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 30, 20, 40, 10, 50, 30);
		
		System.out.println("input: "+ numbers);
		
		Stream<Integer> stream = numbers.stream();
		List<Integer> outPut = stream.distinct().collect(Collectors.toList());
		
		System.out.println(outPut);
	}
}
