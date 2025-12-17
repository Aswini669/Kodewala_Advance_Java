package com.amazon.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringCachingAmazonSearchProduct1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCachingAmazonSearchProduct1Application.class, args);
	}

}
