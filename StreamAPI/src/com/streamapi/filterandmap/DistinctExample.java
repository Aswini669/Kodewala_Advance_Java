package com.streamapi.filterandmap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DistinctExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Apple");
		list.add("Banana");
		list.add("Mango");
		list.add("Banana");   // duplicate
		list.add("Orange");
		list.add("Apple");    // duplicate
		list.add("Grapes");
		
		System.out.println("input: "+ list);
		
		Stream<String> stream = list.stream();
		Stream<String> filteredStream = stream.distinct();
		List<String> outPut4 = filteredStream.collect(Collectors.toList());
		
		System.out.println(outPut4);

	}
}
