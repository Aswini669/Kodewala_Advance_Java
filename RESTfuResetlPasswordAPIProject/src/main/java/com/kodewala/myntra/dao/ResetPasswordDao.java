package com.kodewala.myntra.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kodewala.myntra.entities.PasswordLogEntity;
import com.kodewala.myntra.entities.UserEntity;
import com.kodewala.myntra.reegister.exception.EmailNotFoundException;

@Repository
public class ResetPasswordDao {

	@Autowired
	SessionFactory sessionFactory;
	
	Session session;
	Transaction trsn;
	
	public PasswordLogEntity getPasswordLogEntity(String currentEmail) {
		session = sessionFactory.openSession();
		trsn = session.beginTransaction();
		
		String hql = "SELECT u.id FROM UserEntity u WHERE u.email = :email";
		Integer currentUserId = (Integer) session
				.createQuery(hql)
				.setParameter("email", currentEmail)
				.uniqueResult();

		if(currentUserId == null) {
			throw new EmailNotFoundException("Email Does not Exist...");
		}
		
		String logHql = "FROM PasswordLogEntity p WHERE p.userId = :uid";
		PasswordLogEntity passwordLogEntity = (PasswordLogEntity) session
				.createQuery(logHql)
				.setParameter("uid", currentUserId)
				.uniqueResult();
		return passwordLogEntity;
		
	}
	
	public String updatePassword(String newPassword, PasswordLogEntity passwordLogEntity) {
		passwordLogEntity.setOldestPassword(passwordLogEntity.getOldPassword());
		passwordLogEntity.setOldPassword(passwordLogEntity.getCurrentPassword());
		passwordLogEntity.setCurrentPassword(newPassword);
		
		session.update(passwordLogEntity);
		
		String hql = "FROM UserEntity u WHERE u.id = :userId";
		UserEntity userEntity = (UserEntity) session
				.createQuery(hql)
				.setParameter("userId", passwordLogEntity.getUserId())
				.uniqueResult();
		
		userEntity.setPassword(newPassword);
		session.update(userEntity);
		
		trsn.commit();
		return "Password Reset Successfully";
	}

	
}
