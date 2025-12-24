package Day2;

import java.util.Arrays;
import java.util.List;

public class CovttUpperCase {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Aman","Nikhil","Soumya","Depankar","Kasi Jhia");
		List<String> outPut = list.stream().map(u -> u.toUpperCase()).toList();
		System.out.println(outPut);
	}
}
