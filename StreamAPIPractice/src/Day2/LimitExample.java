package Day2;

import java.util.Arrays;
import java.util.List;

public class LimitExample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
		
		list.stream().limit(4).forEach(System.out::println);
	}
}
