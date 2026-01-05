package Day3;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Aswini","Kumar","Abinash","Dipankar","Nikhil","SoumyaDeep");
		list.stream().forEach(s -> System.out.println(s));
	}
}
