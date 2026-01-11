package Day6;

import java.util.Arrays;
import java.util.List;

public class SortingCustome {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,5,7,3,58,25,36,14,12,19,45);
		list.stream().sorted((a,b) -> a - b).forEach(System.out::println);
		
	}
}
