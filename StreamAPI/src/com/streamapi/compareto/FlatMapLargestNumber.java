package com.streamapi.compareto;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapLargestNumber {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 22, 25, 18, 17, 3, 9, 39, 27, 11, 64);

        Stream<Integer> stream = list.stream();

        Stream<Integer> evenStream = stream.filter(e -> e % 2 == 0);

        Integer maxEven = evenStream.max((a, b) -> a.compareTo(b)).get();

        System.out.println("Maximum even number is: " + maxEven);
    }
}
