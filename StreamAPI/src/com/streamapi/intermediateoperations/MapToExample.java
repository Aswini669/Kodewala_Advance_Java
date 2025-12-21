package com.streamapi.intermediateoperations;

import java.util.Arrays;
import java.util.List;

public class MapToExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("1","21","62","35");
	
		
		list.stream().mapToInt(s -> Integer.parseInt(s)).forEach(System.out::println);
	}
}
