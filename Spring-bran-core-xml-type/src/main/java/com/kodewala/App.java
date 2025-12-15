package com.kodewala;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
    	String config = "\\com\\kodewala\\resources\\applicationContext.xml";
        //create the ioc container
    	ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
    	Account account = (Account)applicationContext.getBean("acc");
    	System.out.println(account.getAccountNum() + " " + account.getType() + " " + account.getIfsc());
    }
}
