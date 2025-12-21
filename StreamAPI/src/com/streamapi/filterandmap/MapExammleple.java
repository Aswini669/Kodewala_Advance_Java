package com.streamapi.filterandmap;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapExammleple {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Sony");
		set.add("Whirlpool");
		set.add("Panasonic");
		set.add("Philips");
		set.add("Onida");
		
		System.out.println("input: "+ set);
		
		Stream<String> stream = set.stream();
		Stream<String> filteredStream = stream.map(j -> j.toUpperCase());
		Set<String> outPut2 = filteredStream.collect(Collectors.toSet());
		
		System.out.println(outPut2);
	}
}
