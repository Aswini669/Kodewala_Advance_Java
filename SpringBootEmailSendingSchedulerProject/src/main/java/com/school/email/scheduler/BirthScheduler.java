package com.school.email.scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.school.email.service.BirthDayService;



@Component
public class BirthScheduler {

	@Autowired
	BirthDayService birthDayService;
	
	@Scheduled(cron = "0 39 17 * * ?")
	public void sendBirthWishes() {
		birthDayService.birthDayWishes();
	}
}
