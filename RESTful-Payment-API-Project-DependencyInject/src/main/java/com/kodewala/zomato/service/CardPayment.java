package com.kodewala.zomato.service;

import org.springframework.stereotype.Service;

import com.kodewala.zomato.request.PaymentRequest;

@Service
public class CardPayment implements PaymentService{

	@Override
	public void pay(PaymentRequest request) {
		System.out.println("inside ");
		
	}

}
