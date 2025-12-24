package Day2;

import java.util.Arrays;
import java.util.List;

public class SkipExample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,8);
		
		//List<Integer> outPut = list.stream().skip(3).collect(Collectors.toList());
		
		list.stream().sorted((a,b) -> b - a).forEach(System.out::println);
	}
}
