package Day1;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("This is from kodewala","We are in BTm","Go with Wind");
		
		list.stream().flatMap(s -> Arrays.stream(s.split(" "))).forEach(System.out::println);
	}
}
