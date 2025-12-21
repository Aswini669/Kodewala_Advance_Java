package com.streamapi.filterandmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReplaceStringExample {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ravi", "Amit", "Rohit", "Anita");
		
		System.out.println("inpuy: "+ names);
		
		Stream<String> stream = names.stream();
		Stream<String> filteredStream = stream.filter(f -> f.startsWith("R"));
		List<String> outPut1 = filteredStream.collect(Collectors.toList());
		
		System.out.println(outPut1);
	}
}
