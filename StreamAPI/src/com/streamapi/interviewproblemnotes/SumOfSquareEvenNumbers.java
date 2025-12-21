package com.streamapi.interviewproblemnotes;

import java.util.Arrays;
import java.util.List;

public class SumOfSquareEvenNumbers {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
		
		int sum = nums.stream().filter(n -> n%2==0).mapToInt(m -> m*m).sum();
		
		System.out.println(sum);
	}
}
