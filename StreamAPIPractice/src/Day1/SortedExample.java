package Day1;

import java.util.Arrays;
import java.util.List;

public class SortedExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Apple","Banana","Cherry","Orange");
		list.stream().sorted().forEach(System.out::println);
	}
}
