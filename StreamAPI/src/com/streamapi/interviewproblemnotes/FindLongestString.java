package com.streamapi.interviewproblemnotes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindLongestString {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("cat","elephant","tiger","hippopotamus");
		
		String longest = list.stream()
				.max(Comparator.comparingInt(String::length))
				.orElse("");
		
		System.out.println(longest);
	}
}
