package com.kodewala.myntra.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kodewala.myntra.entities.PasswordLogEntity;
import com.kodewala.myntra.entities.UserEntity;

@Repository
public class RegisterDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public int register(UserEntity userEntity) {
		Session session = sessionFactory.openSession();
		Transaction trsn = session.beginTransaction();
		Integer userId = (Integer)session.save(userEntity);
		
		PasswordLogEntity passwordLogEntity = new PasswordLogEntity();
		passwordLogEntity.setUserId(userId);
		passwordLogEntity.setCurrentPassword(userEntity.getPassword());
		session.save(passwordLogEntity);
		
		trsn.commit();
		return userId;
	}
}
