package com.streamapi.interviewquestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeFilter {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15);

        List<Integer> primes = numbers.stream()
                .filter(PrimeFilter::isPrime)
                .collect(Collectors.toList());

        System.out.println("Prime Numbers: " + primes);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
