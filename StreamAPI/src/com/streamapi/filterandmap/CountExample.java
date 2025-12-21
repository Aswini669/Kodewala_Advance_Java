package com.streamapi.filterandmap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CountExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(35);
		list.add(67);
		list.add(64);
		list.add(48);
		list.add(32);
		list.add(5);
		list.add(28);
		list.add(62);
		list.add(3);
		
		System.out.println("input: "+ list);
		Stream<Integer> stream = list.stream();
		long filteredStream = stream.count();
		System.out.println(filteredStream);
		
	}
}
