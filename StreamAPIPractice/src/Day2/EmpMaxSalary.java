package Day2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee {

	String empName;
	int empSalary;

	public Employee(String empName, int empSalary) {
		super();
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

}

public class EmpMaxSalary {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Aman", 29000), new Employee("Suman", 39000),
				new Employee("Kriti", 1999));

		Employee maxSalary = list.stream().max(Comparator.comparingInt(n -> n.getEmpSalary())).get();

		Integer outPut = list.stream().map(n -> n.getEmpSalary()).sorted(Comparator.reverseOrder()).skip(1).findFirst()
				.get();
		System.out.println(maxSalary.getEmpName() + " : " + maxSalary.getEmpSalary());
		System.out.println(outPut);
	}

}
