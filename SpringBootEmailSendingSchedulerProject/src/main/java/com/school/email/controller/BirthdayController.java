package com.school.email.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.email.service.BirthDayService;

@RestController
public class BirthdayController {

	@Autowired
	BirthDayService birthDayService;
	
	@GetMapping("addBirthDay")
	public String birthDayWishes() {
		birthDayService.birthDayWishes();
		return "Happy BirthDay";
	}
}
