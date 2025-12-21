package com.streamapi.filterandmap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListOfFirstThreeProduct {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Sony");
		list.add("Whirlpool");
		list.add("Panasonic");
		list.add("Philips");
		list.add("Onida");
		
		System.out.println("input: "+ list);
		
		Stream<String> stream = list.stream();
		Stream<String> filteredStream = stream.limit(3).map(j -> j.toUpperCase());
		List<String> outPutList = filteredStream.collect(Collectors.toList());
		System.out.println(outPutList);
	}
}
