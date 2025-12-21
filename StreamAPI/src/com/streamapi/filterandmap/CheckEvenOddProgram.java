package com.streamapi.filterandmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckEvenOddProgram {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(21, 35, 2, 58, 68, 45, 27, 31);

		System.out.println("input: " + num);

		Stream<Integer> stream = num.stream();
		Stream<Object> filteredStream = stream.filter(d -> d % 2 == 0).map(m -> m * 10);
		List<Object> outPut = filteredStream.collect(Collectors.toList());

		System.out.println("multiple of even number with 10: " + outPut);
	}
}
