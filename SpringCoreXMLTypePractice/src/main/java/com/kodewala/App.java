package com.kodewala;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	String config = "com\\kodewala\\resources\\applicationContext.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        Student student = (Student)applicationContext.getBean("stu");
        System.out.println(student.getId() + "," + student.getName() + "," + student.getStream() + "," + student.getAddress());
        
    }
}
