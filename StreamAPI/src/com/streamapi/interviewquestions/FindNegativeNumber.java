package com.streamapi.interviewquestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindNegativeNumber {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1,23,-6,25,10,-4,-9);
		
		List<Integer> outPut = num.stream()
				.filter(n -> n<0)
				.collect(Collectors.toList());
		
		System.out.println(outPut);
	}
}
