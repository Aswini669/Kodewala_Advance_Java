package com.streamapi.intermediateoperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {

	public static void main(String[] args) {
		List<String> wordds = Arrays.asList("hi","java","go","kkodewala","ai");
		
		List<String> outPut = wordds.stream()
				.filter(n -> n.length()>=3)
				.collect(Collectors.toList());
		
		System.out.println(outPut);
	}
}
