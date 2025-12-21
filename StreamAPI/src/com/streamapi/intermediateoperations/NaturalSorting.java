package com.streamapi.intermediateoperations;

import java.util.List;

public class NaturalSorting {

	public static void main(String[] args) {
		List<String> list = List.of("banana","apple","cherry");
		
		list.stream().sorted().forEach(System.out::println);
	}
}
