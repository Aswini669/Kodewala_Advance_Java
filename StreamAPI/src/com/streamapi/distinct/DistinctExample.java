package com.streamapi.distinct;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DistinctExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("aman","nikhil","soumya","rakesh","deep","karthik");
		
		Stream<String> stream = list.stream();
		Stream<String> distinctStream = stream.distinct();
		List<String> outPut = distinctStream.filter(n -> n.length()>5).collect(Collectors.toList());
		
		System.out.println(outPut);
		

	}
}
