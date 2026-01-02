package com.kodewala.encap.emp;

public class Employee {

	private int empId;
	private String empName;
	private double empSalary;
	
	public void setEmp(int empId,String empName,double empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	public int getEmpId() {
		return empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public double getEmpSalary() {
		return empSalary;
	}
}
