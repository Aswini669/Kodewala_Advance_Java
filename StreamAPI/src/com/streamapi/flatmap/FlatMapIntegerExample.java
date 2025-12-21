package com.streamapi.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapIntegerExample {

	public static void main(String[] args) {
		List<List<Integer>> list = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 9, 8),
				Arrays.asList(10, 15, 20, 11));
		
		System.out.println("input: "+ list);
		
		List<Integer> outPut = list.stream().flatMap(l -> l.stream()).map(n -> n*n).collect(Collectors.toList());
		
		System.out.println("multiplication of nmber is: "+ outPut);

	}

}
