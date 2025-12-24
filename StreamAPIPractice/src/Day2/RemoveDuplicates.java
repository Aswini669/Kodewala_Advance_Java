package Day2;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,4,2,3,7,8);
		
		list.stream().distinct().forEach(System.out::println);
		
		
	}
}
