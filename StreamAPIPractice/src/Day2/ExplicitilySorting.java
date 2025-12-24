package Day2;

import java.util.Arrays;
import java.util.List;

public class ExplicitilySorting {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Orange","Aplle","Chicku","Graps");
		
		List<String> outPut = list.stream().sorted((x,y) -> y.length() - x.length()).toList();
		System.out.println(outPut);
	}
}
