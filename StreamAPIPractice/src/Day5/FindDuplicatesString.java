package Day5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicatesString {

    public static void main(String[] args) {

        List<String> list = Arrays.asList(
                "Abinash", "Aman", "Nikhil",
                "Aswini", "Aman", "Soumya", "Abinash"
        );

//        Set<String> duplicates = list.stream()
//                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(e -> e.getValue() > 1)
//                .map(e -> e.getKey())
//                .collect(Collectors.toSet());
        
        Set<String> duplicates = list.stream()
                .filter(s -> Collections.frequency(list, s) > 1)
                .collect(Collectors.toSet());


        System.out.println("Duplicate names are: " + duplicates);
    }
}
