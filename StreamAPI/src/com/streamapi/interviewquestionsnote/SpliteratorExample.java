package com.streamapi.interviewquestionsnote;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorExample {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60);

        //creates a Spliterator for traversing
        Spliterator<Integer> spliterator1 = numbers.spliterator();

        Spliterator<Integer> spliterator2 = spliterator1.trySplit();

        // Process first half
        System.out.println("First Spliterator:");
        spliterator1.forEachRemaining(n -> System.out.println("Value: " + n));

        // Process second half
        System.out.println("\nSecond Spliterator:");
        spliterator2.forEachRemaining(n -> System.out.println("Value: " + n));
    }
}
