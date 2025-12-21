package com.streamapi.intermediateoperations;

import java.util.Arrays;
import java.util.List;

public class LimitExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("one","two","three","one","six");
		
		list.stream().limit(3).forEach(e -> System.out.println(e));
	}
}
