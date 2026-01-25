package com.kodewala.zomato.service;

import org.springframework.stereotype.Service;

import com.kodewala.zomato.request.PaymentRequest;

@Service
public interface PaymentService {

	public void pay(PaymentRequest request);
}
