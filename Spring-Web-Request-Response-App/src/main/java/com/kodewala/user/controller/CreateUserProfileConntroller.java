package com.kodewala.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.kodewala.user.model.UserProfile;

@Controller
public class CreateUserProfileConntroller {

	@GetMapping("/profile")
	public String userProfile() 
	{
		System.out.println("userProfile()....");
		return "createProfile";
	}
	
	@PostMapping("/showProfile")
	public String createProfile(@ModelAttribute UserProfile userProfile, Model model) 
	{
		System.out.println("First Name: "+ userProfile.getFirstName());
		System.out.println("Last Name: "+ userProfile.getLastName());
		System.out.println("Email: "+ userProfile.getEmail());
		System.out.println("Modile Number: "+ userProfile.getMobile());
		
		String userId = generatedUserId(userProfile.getFirstName(), userProfile.getMobile());
		System.out.println("User Id: " + userId);
		model.addAttribute( "userId",userId);
		return "profileSuccess";
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
