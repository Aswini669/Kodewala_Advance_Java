package com.streamapi.intermediateoperations;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {

	public static void main(String[] args) {
		List<List<String>> list = Arrays.asList(
				Arrays.asList("up","mp","chatisghar","odisha"),
				Arrays.asList("kolkata","meghalaya","punjab"),
				Arrays.asList("chennai","kerla","hydrabad","banglore"));
		
		List<String> outPut = list.stream().flatMap(s -> s.stream()).flatMap(n -> Arrays.stream(n.split(" "))).toList();
		System.out.println(outPut);		
	}
}
