package com.streamapi.classproblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicate {

	public static void main(String[] args) {
		List<Integer> set = Arrays.asList(12,3,30,52,6,12,10,3);
		
		Set<Integer> seen = new HashSet<Integer>();
		
		List<Integer> duplicate = set.stream()
				.filter(n -> !seen.add(n))
				.collect(Collectors.toList());
		
		System.out.println("duplicate number is: "+ duplicate);
	}
	
	
}
