package com.streamapi.interviewquestionsnote;

import java.util.Arrays;
import java.util.List;

public class ShortCircuitTerminal {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2, 4, 6, 7, 8);

        boolean result = numbers.stream()
                                .peek(n -> System.out.println("Checking: " + n))
                                .allMatch(n -> n % 2 == 0); 
        
        System.out.println("All even? " + result);
	}
}
