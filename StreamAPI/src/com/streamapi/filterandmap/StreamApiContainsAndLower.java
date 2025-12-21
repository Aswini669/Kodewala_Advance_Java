package com.streamapi.filterandmap;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiContainsAndLower {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("mango");
		set.add("applo");
		set.add("lichu");
		set.add("chiku");
		set.add("sapuri");
		set.add("anaro");
		
		System.out.println("input: "+ set);
		
		Stream<String> stream = set.stream();
		Stream<String> filteredStream = stream.filter(a -> a.contains("a")).map(b -> b.toUpperCase());
		Set<String> outPutSet = filteredStream.collect(Collectors.toSet());
		System.out.println(outPutSet);
	}
}
