package Day3;

import java.util.Arrays;
import java.util.List;

public class MinExampe {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,5,6,3,7,2);
		
		Integer outPut = list.stream().min((a,b) -> a-b).get();
		System.out.println(outPut);
	}
}
