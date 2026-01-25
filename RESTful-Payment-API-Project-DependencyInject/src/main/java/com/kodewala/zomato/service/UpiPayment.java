package com.kodewala.zomato.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.kodewala.zomato.request.PaymentRequest;

@Primary
@Service
public class UpiPayment implements PaymentService{

	@Override
	public void pay(PaymentRequest request) {
		System.out.println("inside upi payment");
	}

}
