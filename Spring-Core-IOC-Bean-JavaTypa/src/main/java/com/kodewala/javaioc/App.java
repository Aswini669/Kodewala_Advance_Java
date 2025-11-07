package com.kodewala.javaioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.javapojo.ConfigSpring;
import com.kodewala.javapojo.Order;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigSpring.class);
        Order order = (Order)context.getBean("ord");
        
        System.out.println(order.getSrlNo() +" " + order.getProName() + " " + order.getStatus());
    }
}
