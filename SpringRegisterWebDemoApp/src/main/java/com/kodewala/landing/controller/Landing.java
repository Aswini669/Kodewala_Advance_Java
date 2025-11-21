package com.kodewala.landing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Landing {

	@RequestMapping("/signoff")
	public ModelAndView doSighnOff() {
		System.out.println("Sign Off Done");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("displaySignoff");
		return mv;
	}
	
	
	
}
