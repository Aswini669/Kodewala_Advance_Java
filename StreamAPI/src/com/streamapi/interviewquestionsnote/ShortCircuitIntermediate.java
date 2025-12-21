package com.streamapi.interviewquestionsnote;

import java.util.stream.IntStream;

public class ShortCircuitIntermediate {

	public static void main(String[] args) {
		IntStream.range(1, 10).limit(6)
		         .forEach(System.out::println);
	}
}
