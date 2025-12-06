package com.kodewala.myntra.service;

import org.springframework.stereotype.Service;

import com.kodewala.myntra.bean.ResetPassword;

@Service
public interface ResetPasswordService {

	String resetPassword(ResetPassword resetPassword);
}
