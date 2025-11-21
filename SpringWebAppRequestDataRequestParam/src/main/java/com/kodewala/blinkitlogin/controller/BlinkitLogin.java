package com.kodewala.blinkitlogin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BlinkitLogin {

	@RequestMapping("/showLogin")
	public String showLoginPage() {
		System.out.println("Login Done");
		return "login";
	}
	
	@RequestMapping("/panLogin")
	public String doLogin(@RequestParam("userName") String userName, @RequestParam("password") String password) {
		System.out.println("Login Successfully");
		System.out.println("User name is : " + userName);
		System.out.println("Password is : " + password);
		return "loginSuccess";
	}
}
