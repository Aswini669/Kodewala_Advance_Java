package com.kodewala.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping("login")
	public ModelAndView doLogin() {
		System.out.println("Login Happedn");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("displayLogin");
		return mv;
	}
}
