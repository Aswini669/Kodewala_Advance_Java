package Day3;

import java.util.Arrays;
import java.util.List;

public class CountExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Aswini","Kumar","Abinash","Dipankar","Nikhil","SoumyaDeep");
		
		long outPut = list.stream().filter(n -> n.startsWith("A")).count();
		System.out.println(outPut);
	}
}
