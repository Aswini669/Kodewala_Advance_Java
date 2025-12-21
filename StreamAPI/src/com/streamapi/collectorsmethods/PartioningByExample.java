package com.streamapi.collectorsmethods;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PartioningByExample {

	public static void main(String[] args) {
		Map<Boolean, List<Integer>> partitioned = Stream.of(1,2,3,4,5)
				.collect(Collectors.partitioningBy(n -> n%2==0));
		
		System.out.println(partitioned);
	}
}
