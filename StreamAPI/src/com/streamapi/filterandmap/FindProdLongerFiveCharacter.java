package com.streamapi.filterandmap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindProdLongerFiveCharacter {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("India");
		list.add("USA");
		list.add("Germany");
		list.add("Japan");
		list.add("France");

		System.out.println("input: "+ list);
		
		Stream<String> stream = list.stream();
		Stream<String> filteredStream = stream.filter(j -> j.length()>3).map(k -> k.concat(" from the world"));
		List<String> outPutList = filteredStream.collect(Collectors.toList());
		System.out.println(outPutList);
	}
}
