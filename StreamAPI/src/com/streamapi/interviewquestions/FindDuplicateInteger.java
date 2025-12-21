package com.streamapi.interviewquestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindDuplicateInteger {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(10,25,3,6,68,6,2,10,3);
		
		HashSet<Integer> seen = new HashSet<Integer>();
		
		List<Integer> duplicateInteger = num.stream().filter(n -> !seen.add(n)).toList();
		
		System.out.println("duplicate number is: " +duplicateInteger);
	}
}
