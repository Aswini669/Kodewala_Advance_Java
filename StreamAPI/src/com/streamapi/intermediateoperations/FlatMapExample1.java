package com.streamapi.intermediateoperations;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample1 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("This is from kodewala","we are in btm","gone with the wind");
		
		list.stream().flatMap(s -> Arrays.stream(s.split(" "))).forEach(w -> System.out.println(w));
	}
}
