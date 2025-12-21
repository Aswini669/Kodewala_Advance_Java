package com.streamapi.filterandmap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("LG");
		list.add("Samsung");
		list.add("Sansui");
		list.add("Signma");
		list.add("Godrej");
		
		//
		System.out.println("input: "+ list);
		
		//convert the list to stream object
		Stream<String> stream = list.stream();
		
		//apply the logic (filter the products start with 'S')
		Stream<String> filteredStream = stream.filter(j -> j.startsWith("S")).map(w -> w.toUpperCase());
		
		//collect the data
		List<String> outPutlist = filteredStream.collect(Collectors.toList());
		
		System.out.println("output: "+ outPutlist);
		
		
		
	}
}
