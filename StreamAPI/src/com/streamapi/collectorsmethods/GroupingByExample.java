package com.streamapi.collectorsmethods;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingByExample {

	public static void main(String[] args) {
		Map<Integer, List<String>> grouped = Stream.of("one","two","three","four")
				.collect(Collectors.groupingBy(s -> s.length()));
		
		System.out.println(grouped);
	}
}
