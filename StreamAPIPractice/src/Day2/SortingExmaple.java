package Day2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingExmaple {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Karthik","Aman","Nikhil","Soumya","Kode");
		
		List<String> outPut = list.stream().sorted().collect(Collectors.toList());
		System.out.println(outPut);
	}
}
