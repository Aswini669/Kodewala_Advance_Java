package com.kodewala.myntra.password.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kodewala.myntra.bean.ResetPassword;
import com.kodewala.myntra.service.ResetPasswordService;

@RestController
public class PasswordResetController {
	
	@Autowired
	ResetPasswordService resetPasswordService;
	
	@PostMapping("passwordReset")
	public String passwordReset(@RequestBody ResetPassword resetPassword) {
		String message = resetPasswordService.resetPassword(resetPassword);
		return message;
	}
}
