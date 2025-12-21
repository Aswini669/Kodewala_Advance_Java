package com.streamapi.interviewquestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindDuplicateCharacterFromString {

	public static void main(String[] args) {
		List<String> town = Arrays.asList("cuttack","bhubaneswar","balasore","bhadrak","berhumpur","jajpur");
		
		HashSet<Character> seen = new HashSet<>();
		
		List<Character> duplicate = town.stream().map(n -> n.charAt(0)).filter(e -> !seen.add(e)).toList();
		
		System.out.println(duplicate);
	}
}
