package com.kodewala.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginLogoutController {

	@RequestMapping("login")
	public String doLogin() {
		System.out.println("Login working");
		return "loginSuccess";
	}
	
	@RequestMapping("logout")
	public String doLogout() {
		return "logoutSuccess";
	}
}
