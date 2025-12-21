package com.streamapi.filterandmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIEndsGLowerCase {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("La", "Samsung", "Sansua", "Signma", "Godrej");
		
		System.out.println("input: "+ list);
		
		Stream<String> stream = list.stream();
		Stream<Object> filteredStream = stream.filter(a -> a.endsWith("a")).map(b -> b.toLowerCase());
		
		List<Object> outPutList = filteredStream.collect(Collectors.toList());
		System.out.println(outPutList);
	}
}
