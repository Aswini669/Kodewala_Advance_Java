package com.streamapi.intermediateoperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapFilterExample {

	public static void main(String[] args) {
		List<String> name = Arrays.asList("delhi","mumbai","pune","noida");
		
		List<String> outPut = name.stream()
				.filter(n -> n.startsWith("p"))
				.map(w -> w.toUpperCase())
				.collect(Collectors.toList());
		
		System.out.println(outPut);
	}
}
