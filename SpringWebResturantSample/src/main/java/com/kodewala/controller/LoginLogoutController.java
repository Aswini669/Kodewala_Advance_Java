package com.kodewala.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginLogoutController {

	@RequestMapping("login")
	public String doLogin() {
		System.out.println("login happen");
		return "displayLogin";
	}
	
	@RequestMapping("logout")
	public String doLogout() {
		System.out.println("logout the page.....");
		return "logoutPage";
	}
}
