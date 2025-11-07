package com.kodewala.javapojo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigSpring {

	@Bean("ord")
	public Order springConfigBean() {
		Order order = new Order();
		order.setSrlNo("SM1452");
		order.setProName("Samsung S29");
		order.setStatus("Pending");
		return order;
	}
}
