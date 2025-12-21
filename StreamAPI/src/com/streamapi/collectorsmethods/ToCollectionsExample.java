package com.streamapi.collectorsmethods;

import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToCollectionsExample {

	public static void main(String[] args) {
		LinkedList<String> linkedList = Stream.of("a","b","c","d")
				.collect(Collectors.toCollection(() -> new LinkedList<String>()));
		
		System.out.println(linkedList);
	}
}
