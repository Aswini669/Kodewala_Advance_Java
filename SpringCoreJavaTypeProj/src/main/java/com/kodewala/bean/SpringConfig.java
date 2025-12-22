package com.kodewala.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

	@Bean("order")
	public Order createOrdre() {
		Order order = new Order();
		order.setOrderId(1002);
		order.setOrdName("Samsung");
		order.setStatus("Delivered");
		order.setDescription("This is valuable product");
		return order;
	}
}
