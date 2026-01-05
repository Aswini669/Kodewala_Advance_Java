package Day3;

import java.util.Arrays;
import java.util.List;

public class MAxExample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,5,6,3,7,2);
		
	 	Integer outPut = list.stream().max((x,y) -> x-y).get();
	 	System.out.println(outPut);
	}
}
