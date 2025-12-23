package Day1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	String id;
	String name;
	String age;

	public Employee(String id, String name, String age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

}

public class EmployeeName {

	public static void main(String[] args) {

		List<Employee> list = Arrays.asList(new Employee("10", "Soumya", "20"),
				new Employee("11", "Nishi", "22"),
				new Employee("12", "Aman", "25"));
		List<String> outPut = list.stream().map(e -> e.getName()).collect(Collectors.toList());
		System.out.println("emaployee name: " + outPut);
		
	}
}
