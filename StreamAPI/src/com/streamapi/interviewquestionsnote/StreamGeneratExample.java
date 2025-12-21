package com.streamapi.interviewquestionsnote;

import java.util.stream.Stream;

public class StreamGeneratExample {

	public static void main(String[] args) {
		Stream.generate(() -> "Hello").limit(5).forEach(System.out::println);
	}
}
