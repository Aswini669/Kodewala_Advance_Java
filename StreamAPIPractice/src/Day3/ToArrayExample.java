package Day3;

import java.util.Arrays;
import java.util.List;

public class ToArrayExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Aswini","Kumar","Abinash","Dipankar","Nikhil","SoumyaDeep");
		
		String[] nameArray = list.stream().toArray(s -> new String[s]);
		System.out.println(Arrays.toString(nameArray));
	}
}
