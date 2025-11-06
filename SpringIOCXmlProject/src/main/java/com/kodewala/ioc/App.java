package com.kodewala.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	String config = "resources\\confix.xml";
    	ClassPathXmlApplicationContext cpa = new ClassPathXmlApplicationContext(config);
    	
    	//for items
    	Items item = (Items)cpa.getBean("itm");
    	System.out.println(item.getSrlNo() + " "+ item.getItemName() + " " + item.getPrice());
    	
    	//for products
    	Product product = (Product)cpa.getBean("prod");
    	System.out.println(product.getSrlNo() + " " + product.getProdName() + " " + product.getPrice());
    }
    
}
