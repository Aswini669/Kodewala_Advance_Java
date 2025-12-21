package com.streamapi.intermediateoperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("kodewala","Academy","java");
		
		Stream<String> outPut = list.stream()
				.map(n -> n.toUpperCase());
		
		outPut.forEach(m -> System.out.println(m));
	}
}
