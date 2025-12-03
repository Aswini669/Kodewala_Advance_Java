package com.kodewala.payment.service;

import org.springframework.stereotype.Service;

import com.kodewala.payment.bean.PaymentBean;

@Service
public class UpiPayment implements PaymentService{

	@Override
	public String pay(PaymentBean paymentBean) {
		System.out.println("inside UPI payment");
		return null;
	}

}
