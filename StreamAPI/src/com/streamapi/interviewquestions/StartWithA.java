package com.streamapi.interviewquestions;

import java.util.Arrays;
import java.util.List;

public class StartWithA {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Apple", "Banana", "Avocado", "Mango", "Apricot", "Grapes");
		
		List<String> outPut = names.stream()
				.filter(n -> n.startsWith("A"))
				.toList();
		
		System.out.println(outPut);
	}
}
