package com.streamapi.intermediateoperations;

import java.util.List;

public class CustomeSorting {

	public static void main(String[] args) {
		List<String> list = List.of("kodewala","Academy","Banglore");
		
		list.stream().sorted((a,b) -> a.length()-b.length()).forEach(System.out::println);
	}
}
