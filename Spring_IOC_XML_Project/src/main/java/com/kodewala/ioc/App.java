package com.kodewala.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
    	String config = "\\ressources\\config.xml";
        ClassPathXmlApplicationContext cpa = new ClassPathXmlApplicationContext(config);
        
        Employee employee = (Employee)cpa.getBean("emp");
        System.out.println(employee.getEmpId() + " " + employee.getEmpName() + " " + employee.getEmpSalary());
    }
}
