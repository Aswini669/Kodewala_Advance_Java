package com.kodewala.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.annotationbean.Hospital;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Hospital hospital = context.getBean(Hospital.class);
        
        System.out.println(hospital.getPatientId() + " " + hospital.getPatientName());
    }
}
