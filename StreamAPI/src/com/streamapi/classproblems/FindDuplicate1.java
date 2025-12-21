package com.streamapi.classproblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicate1 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12,3,30,52,6,12,10,3);
		
		Set<Integer> set = new HashSet<Integer>();
		
		List<Integer> duplicat = list.stream().filter(n -> !set.add(n)).toList();
		
		System.out.println("duplicate number is: " + duplicat);
	}
}
