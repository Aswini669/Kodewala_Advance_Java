package com.kodewala.myntra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodewala.myntra.bean.UserRegBean;
import com.kodewala.myntra.dao.RegisterDao;
import com.kodewala.myntra.entities.UserEntity;

@Service
public class RegisterServiceImplementation implements RegisterService{

	@Autowired
	RegisterDao registerDao;
	
	@Override
	public int doRegister(UserRegBean userBean) {
		UserEntity userEntity = new UserEntity();
		userEntity.setFirstName(userBean.getFirstName());
		userEntity.setLastName(userBean.getLastName());
		userEntity.setEmail(userBean.getEmail());
		userEntity.setPhone(userBean.getPhone());
		userEntity.setPassword(userBean.getPassword());
		
		int userId = registerDao.register(userEntity);
		return userId;
	}

}
