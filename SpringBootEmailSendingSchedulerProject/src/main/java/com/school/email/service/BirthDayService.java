package com.school.email.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.email.entity.UserBirthday;
import com.school.email.repository.BirthDayRepo;

@Service
public class BirthDayService {

	@Autowired
	BirthDayRepo birthDayRepo;
	
	
	public void birthDayWishes() {
		List<UserBirthday> users = birthDayRepo.findTodayBirthDay();
		
		if(users.isEmpty()) {
			System.out.println("no birthday today");
			return;
		}
		
		for(UserBirthday user: users) {
			System.out.println("Happy Birthday " + user.getName());
		}
	}
}
