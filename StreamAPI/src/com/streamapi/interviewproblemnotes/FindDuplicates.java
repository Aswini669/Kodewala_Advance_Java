package com.streamapi.interviewproblemnotes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,2,4,5,1);
		
		Set<Integer> duplicates = nums.stream()
				.filter(n -> Collections.frequency(nums, n)>1)
				.collect(Collectors.toSet());
		
		System.out.println(duplicates);
	}
}
