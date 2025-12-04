package com.kodewala.myntra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodewala.myntra.bean.ResetPassword;
import com.kodewala.myntra.dao.ResetPasswordDao;

@Service
public class ResetPasswordService {

	
	@Autowired
	private ResetPasswordDao resetPasswordDao;
	
	public String resetPassword(ResetPassword resetPassword) {
		return resetPasswordDao.resetPassword(resetPassword);
	}
}
