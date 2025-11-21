package com.kodewala.loginout.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginLogoutController {

	@RequestMapping("/login")
	public ModelAndView doLogin() {
		System.out.println("login done");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("displayLogin");
		return mv;
	}
	
	@RequestMapping("/logout")
	public ModelAndView doLogout() {
		System.out.println("logout done");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("displayLogout");
		return mv;
	}
}
