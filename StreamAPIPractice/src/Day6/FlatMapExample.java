package Day6;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {

	public static void main(String[] args) {
		List<String> lisst = Arrays.asList("This is my fro kod","I am aswini","Suresh Sir is My Mentor");
		lisst.stream().flatMap(s -> Arrays.stream(s.split(" "))).forEach(System.out::println);
	}
}
