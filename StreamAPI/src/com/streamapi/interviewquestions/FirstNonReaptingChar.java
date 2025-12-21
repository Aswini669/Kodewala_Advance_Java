package com.streamapi.interviewquestions;

public class FirstNonReaptingChar {

	public static void main(String[] args) {

		String state = "Haryana";
		
		Character nonReapting = state.chars()
				.mapToObj(c -> (char)c)
				.filter(c -> state.indexOf(c) == state.lastIndexOf(c))
				.findFirst()
				.orElse(null);
		
		System.out.println("non reapting character: " + nonReapting);
	}
}
