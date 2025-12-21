package com.streamapi.classproblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DuplicateFirstCharacter {

	public static void main(String[] args) {
		List<String> names = Arrays.asList(
                "Gyana", "Gopal", "Aswini", "Soumya", "Sagar", "Nikhil", "Ankit");
		
		HashSet<Character> seen = new HashSet<Character>();
		
		List<Character> duplicateFirstChar = names.stream()
				.map(n -> n.charAt(0))
				.filter(e -> !seen.add(e))
				.toList();
		
		//change to all string to lower case and perform the operation
//		List<Character> duplicateFirstChars = names.stream()
//	                .map(n -> Character.toLowerCase(n.charAt(0))) // ✅ convert first char to lowercase
//	                .filter(ch -> !seen.add(ch))                  // ✅ find duplicates
//	                .toList();
		
		System.out.println(duplicateFirstChar);
	}
}
