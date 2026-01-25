package com.kodewala.shop.service;

import org.springframework.stereotype.Service;

import com.kodewala.shop.request.PaymentRequest;

@Service
public interface PaymentService {

	public int pay(PaymentRequest request);
}
