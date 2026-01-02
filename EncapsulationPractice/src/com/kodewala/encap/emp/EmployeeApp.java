package com.kodewala.encap.emp;

public class EmployeeApp {

	public static void main(String[] args) {
		Employee emp = new Employee();
		
		emp.setEmp(100, "Soumya", 290000);
		
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getEmpSalary());
	}
}
