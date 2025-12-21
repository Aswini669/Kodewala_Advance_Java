package com.streamapi.filterandmap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Apple");
		list.add("Banana");
		list.add("Mango");
		list.add("Orange");
		list.add("Grapes");
		
		System.out.println("input: "+ list);
		Stream<String> stream = list.stream();
		List<String> outPut3 = stream.sorted().collect(Collectors.toList());
		
		System.out.println(outPut3);
	}
}
