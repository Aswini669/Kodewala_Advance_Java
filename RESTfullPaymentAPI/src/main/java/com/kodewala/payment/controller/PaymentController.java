package com.kodewala.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kodewala.payment.bean.PaymentBean;
import com.kodewala.payment.service.PaymentService;

@RestController
public class PaymentController {
	
	@Autowired
	PaymentService paymentService;

	@PostMapping("doPayment")
	public String doPayment(@RequestBody PaymentBean paymentBean) {
		System.out.println("Details of Payment: " + paymentBean.getOrderId());
		String result = paymentService.pay(paymentBean);
		return result;
	}
}
