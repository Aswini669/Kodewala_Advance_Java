package com.kodewala.payment.service;

import org.springframework.stereotype.Service;

import com.kodewala.payment.bean.PaymentBean;

@Service
public interface PaymentService {

	public int pay(PaymentBean paymentBean);
}
