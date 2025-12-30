package com.kodewala.samsung.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping("showLogin")
	public String showLogin() {
		System.out.println("show the login page");
		return "displayLogin";
	}
	
	@RequestMapping("signin")
	public String doLogin(@RequestParam("userName") String userName, @RequestParam("password") String password) {
		System.out.println("your details are: ");
		System.out.println("user name : " + userName);
		System.out.println("password: " + password);
		return "loginSuccess";
	}
}
