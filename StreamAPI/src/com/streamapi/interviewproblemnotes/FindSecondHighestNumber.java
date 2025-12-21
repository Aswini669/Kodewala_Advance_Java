package com.streamapi.interviewproblemnotes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindSecondHighestNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,20,40,50,60);
		
		Integer secondHighest = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		
		System.out.println(secondHighest);
	}
}
