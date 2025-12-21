package com.streamapi.interviewproblemnotes;

public class FirstNonReaptingChar {

	public static void main(String[] args) {
		String input = "nikhil";
		
		Character firsstNonRepeat = input.chars()
				.mapToObj(c -> (char)c)
				.filter(ch -> input.indexOf(ch) == input.lastIndexOf(ch))
				.findFirst()
				.orElse(null);
		
		System.out.println("first non-repeated: " + firsstNonRepeat);
	}
}
