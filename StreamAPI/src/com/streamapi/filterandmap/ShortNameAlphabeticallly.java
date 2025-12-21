package com.streamapi.filterandmap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ShortNameAlphabeticallly {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Odisha");
		list.add("Maharashtra");
		list.add("Kerala");
		list.add("Punjab");
		list.add("Gujarat");
		
		System.out.println("input: "+ list);
		
		Stream<String> stream = list.stream();
		Stream<String> sortedStream = stream.sorted().map(k -> k.toUpperCase());
		List<String> outPutList = sortedStream.collect(Collectors.toList());
		System.out.println(outPutList);
	}
}
