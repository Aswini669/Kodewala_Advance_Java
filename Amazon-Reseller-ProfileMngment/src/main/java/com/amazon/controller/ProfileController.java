package com.amazon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.amazon.bean.User;

@Controller
public class ProfileController {
	
	String dbEmail;
	String dbPassword;

	@RequestMapping("showPofile")
	public String showPofile() {
		System.out.println("show profile page");
		return "createProfilePage";
	}
	
	@PostMapping("createProfile")
	public String createProfile() {
		System.out.println("Re-seller profile created successfully created");
		return "finalPage";
	}
	
	@RequestMapping("profileLogin")
	public String profileLogin() {
		return "loginProfilePage";
	}
	
	@PostMapping("login")
	public String doLogin(@ModelAttribute User user, Model model) {
		System.out.println("First name: " + user.getFirstName());
		System.out.println("Last name: " + user.getLastName());
		System.out.println("Email: " + user.getEmail());
		System.out.println("Mobile: " + user.getMobile());
		System.out.println("Password: " + user.getPassword());
		
		dbEmail = user.getEmail();
		dbPassword = user.getPassword();
		
		String email = user.getEmail();
		String mobile = user.getMobile();
		
		String userId = generateUserId(email, mobile);
		model.addAttribute("userId", userId);
		
		System.out.println("generated user id: " + userId);
		return "loginProfilePage";
	}
	
	@RequestMapping("loginSuccess")
	public String loginSuccess(@RequestParam("email") String email, @RequestParam("password") String password) {
		boolean result = validateUser(email, password);
		if(result) {
			return "finalPage";
		}
		else {
			return "LoginFailed";
		}
	}
	
	public boolean validateUser(String email,String password) {
		if(dbEmail.equals(email) && dbPassword.equals(password)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static String generateUserId(String email, String mobile) {
		String username = email.split("@")[0];
		String first4 = username.length() >= 4 ? username.substring(0, 4) : username;
		String last4 = mobile.substring(mobile.length() - 4);
		return first4 + last4;
	}
}
