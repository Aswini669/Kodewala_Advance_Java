package Day1;

import java.util.Arrays;
import java.util.List;

public class MapToExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("10","12","30");
		
		list.stream().mapToInt(s -> Integer.parseInt(s)).forEach(System.out::println);
	}
}
