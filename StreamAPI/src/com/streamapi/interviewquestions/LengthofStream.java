package com.streamapi.interviewquestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LengthofStream {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Apple", "Banana", "Mango", "Orange", "Kiwi");
		
		System.out.println("input: "+ list);
		
		Stream<String> stream = list.stream();
		List<Integer> outPut = stream.map(l -> l.length()).collect(Collectors.toList());
		
		System.out.println("length of the given string of stream is: " + outPut);
	}
}
