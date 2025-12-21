package com.streamapi.interviewproblemnotes;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByLength {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("one","five","four","six");
		
		Map<Object, List<String>> outPut = words.stream()
				.collect(Collectors.groupingBy(s -> s.length()));
		
		System.out.println(outPut);
	}
}
