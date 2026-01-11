package Day6;

import java.util.Arrays;
import java.util.List;

public class DistinctExample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,5,1,6,7,8,2);
		list.stream().distinct().forEach(s -> System.out.print("number is : "+ s));
	}
}
