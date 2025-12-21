package com.streamapi.intermediateoperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PeakExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("abc","defgh","ijklm");
		
		Stream<String> peeked = list.stream().peek(v -> System.out.println("peeking: "+ v));
		
		//peeked.forEach(System.out::println);
		
		peeked.forEach(e -> System.out.println("final: "+ e));
	}
}
