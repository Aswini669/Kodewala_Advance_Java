package com.kodewala.sumsung.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kodewala.sumsung.request.Profile;

@Controller
public class SignupController {

	@RequestMapping("signup")
	public String showSignup() {
		System.out.println("Show Sign Up PAge");
		return "signupPage";
	}
	
	@PostMapping("createProfile")
	public String createAccount(@ModelAttribute Profile profile, Model model) {
		System.out.println("first name: " + profile.getFirstName());
		System.out.println("last name: " + profile.getLastName());
		System.out.println("Email: " + profile.getEmail());
		System.out.println("Mobile: " + profile.getMobile());
		System.out.println("Password: " + profile.getPassword());
		System.out.println("Confirm Password: " + profile.getConfirmPassword());
		
		String email = profile.getEmail();
		String mobile = profile.getMobile();
		
		String userId = generatedUserId(email, mobile);
		
		model.addAttribute("userId",userId);
		
		System.out.println("generated user id is: " + userId);
		return "accountSuccessPage";
	}
	
	public static String generatedUserId(String firstName, String mobile) {
		if(firstName==null || firstName.isEmpty() || mobile==null || mobile.length()<4) {
			throw new IllegalArgumentException("Invalid input");
		}
		
		String namePart = firstName.trim().toLowerCase();
		
		String mobilePart = mobile.substring(mobile.length() - 4);
		
		return namePart + mobilePart;
	}
}
