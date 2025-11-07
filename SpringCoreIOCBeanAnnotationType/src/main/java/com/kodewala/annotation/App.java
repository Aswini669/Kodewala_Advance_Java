package com.kodewala.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.Ordered;

import com.kodewala.annotationbean.OrderId;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        OrderId orderId = (OrderId)context.getBean(OrderId.class);
        
        System.out.println(orderId.getSrlNo());
    }
}
