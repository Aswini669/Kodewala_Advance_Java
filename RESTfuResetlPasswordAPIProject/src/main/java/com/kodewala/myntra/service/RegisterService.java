package com.kodewala.myntra.service;

import org.springframework.stereotype.Service;

import com.kodewala.myntra.bean.UserRegBean;

@Service
public interface RegisterService {

	int doRegister(UserRegBean userBean);
}
