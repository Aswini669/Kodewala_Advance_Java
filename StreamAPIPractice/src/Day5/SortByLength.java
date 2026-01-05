package Day5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortByLength {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("banana","apple","litchu","kiwi","grape");
		list.stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);
	}
}
