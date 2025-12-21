package com.streamapi.intermediateoperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("one","two","three","one","six");
		
		List<String> outPut = list.stream()
				.distinct()
				.collect(Collectors.toList());
		
		System.out.println(outPut);
	} 
}
