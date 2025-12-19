package com.school.email;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
@EnableScheduling
@SpringBootApplication
public class SpringBootEmailSendingSchedulerProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEmailSendingSchedulerProjectApplication.class, args);
	}

}
