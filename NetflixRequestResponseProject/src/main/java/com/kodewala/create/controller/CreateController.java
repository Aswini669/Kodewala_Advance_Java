package com.kodewala.create.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kodewala.create.models.Userprofile;

@Controller
public class CreateController {
	
	@RequestMapping("profile")
	public String showProfile() {
		System.out.println("Server hiteed");
		return "profile";
	}
	
	@RequestMapping("createProfile")
	public String createProfile(@ModelAttribute Userprofile userprofile, Model model) {
		
		System.out.println("First Name: " + userprofile.getFirstName());
		System.out.println("Last Name: " + userprofile.getLastName());
		System.out.println("Email: " + userprofile.getEmail());
		System.out.println("Mobile Number: " + userprofile.getMobile());
		System.out.println("Password: " + userprofile.getPassword());
		System.out.println("Confirm_Password: " + userprofile.getConfirmPassword());
		
		String email = userprofile.getEmail();
		String mobile = userprofile.getMobile();
		
		String userId = generateUserId(email, mobile);
		
		model.addAttribute("userID", userId);
		
		System.out.println(" Generated user id is : " + userId);
		
		return "successProfile";
	}
	
	public static String generateUserId(String email, String mobile) {
		String username = email.split("@")[0];
		String first4 = username.length() >= 4 ? username.substring(0, 4) : username;
		String last4 = mobile.substring(mobile.length() - 4);
		return first4 + last4;
	}
}
