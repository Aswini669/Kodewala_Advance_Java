package com.kodewala.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kodewala.bean.User;

@Controller
public class ProfileController {

	@RequestMapping("showProfile")
	public String showProfile() {
		System.out.println("show profile pahge");
		return "showAccount";
	}
	
	@PostMapping("createProfile")
	public String createProfile(@ModelAttribute User user, Model model) {
		System.out.println("first name: " + user.getFirstName());
		System.out.println("first name: " + user.getLastName());
		System.out.println("first name: " + user.getEmail());
		System.out.println("first name: " + user.getMobile());
		
		String email = user.getEmail();
		String mobile = user.getMobile();
		
		
		String userId = generateUserId(email, mobile);
		System.out.println("your user is : " + userId);
		
		model.addAttribute("userID", userId);
		
		return "profileSuccess";
	}
	
	public static String generateUserId(String email, String mobile) {
		String username = email.split("@")[0];
		String first4 = username.length() >= 4 ? username.substring(0, 4) : username;
		String last4 = mobile.substring(mobile.length() - 4);
		return first4 + last4;
	}
}
