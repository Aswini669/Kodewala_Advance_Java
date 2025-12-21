package com.streamapi.compareto;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestComparator {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 9, 2, 20, 15, 20);

        Integer outPut = numbers.stream()
                .distinct()                    // Remove duplicate numbers (20 appears twice)
                .sorted(Comparator.reverseOrder()) // Sort the numbers in descending order
                .skip(1)                       // Skip the first number (the highest)
                .findFirst()                   // Take the next number (the second highest)
                .orElse(null);                 // If list is empty, return null instead of throwing exception

        System.out.println("The second highest number is: " + outPut);
    }
}
