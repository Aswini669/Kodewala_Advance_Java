package com.kodewala.myntra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodewala.myntra.bean.ResetPassword;
import com.kodewala.myntra.dao.ResetPasswordDao;
import com.kodewala.myntra.entities.PasswordLogEntity;
import com.kodewala.myntra.reegister.exception.DuplicateException;

@Service
public class ResetPasswordServiceImplementation implements ResetPasswordService{

	
	@Autowired
	ResetPasswordDao resetPasswordDao;
	
	@Override
	public String resetPassword(ResetPassword resetPassword) {
		String currentEmail = resetPassword.getEmail();
		PasswordLogEntity passwordLogEntity = resetPasswordDao.getPasswordLogEntity(currentEmail);
		
		String newPassword = resetPassword.getNewPassword();
		String currentPassword = passwordLogEntity.getCurrentPassword();
		String oldPassword = passwordLogEntity.getOldPassword();
		String oldestPassword = passwordLogEntity.getOldestPassword();
		
		if (newPassword.equalsIgnoreCase(currentPassword)) {
			throw new DuplicateException("new password is same as current password");
		} 
		else {
			if (oldPassword == null) {
				return resetPasswordDao.updatePassword(newPassword, passwordLogEntity);
			} 
			else if (newPassword.equalsIgnoreCase(oldPassword)) {
				throw new DuplicateException("your password must not be your previous 3 passwords");
			} 
			else {
				if (oldestPassword == null) {
					return resetPasswordDao.updatePassword(newPassword, passwordLogEntity);
				} 
				else if (newPassword.equalsIgnoreCase(oldestPassword)) {
					throw new DuplicateException("your password must not be your previous 3 passwords");
				} 
				else {
					return resetPasswordDao.updatePassword(newPassword, passwordLogEntity);
				}
			}
		}
	}
}
