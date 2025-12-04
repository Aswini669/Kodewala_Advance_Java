package com.kodewala.myntra.reegister.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kodewala.myntra.bean.UserRegBean;
import com.kodewala.myntra.service.RegisterServiceImplementation;

@RestController
public class ResgisterController {

	@Autowired
	RegisterServiceImplementation resiImple;
	
	@PostMapping("register")
	public int register(@RequestBody UserRegBean userBean) {
		int userId = resiImple.doRegister(userBean);
		return userId;
	}
}
