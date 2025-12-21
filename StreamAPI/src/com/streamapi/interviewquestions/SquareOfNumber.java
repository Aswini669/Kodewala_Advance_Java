package com.streamapi.interviewquestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SquareOfNumber {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(2,3,6,9,8,11,13);
		
		Stream<Integer> stream = num.stream();
		List<Integer> outPut = stream.map(n -> n*n).collect(Collectors.toList());
		
		System.out.println("square of given number is: " + outPut);
	}
}
