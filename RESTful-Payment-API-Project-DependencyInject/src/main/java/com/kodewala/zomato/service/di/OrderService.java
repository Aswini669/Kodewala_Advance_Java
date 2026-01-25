package com.kodewala.zomato.service.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

  	private PaymentService paymentService;
  	
  	//constructor dependency --> When dependencies are mandatory and immutable
  	public OrderService(PaymentService _paymentService) {
  		this.paymentService = _paymentService;
	}
  	
  	//setter dependency, dependency are optional, mutable
  	@Autowired
  	public void setPayment(PaymentService _paymentService) {
  		this.paymentService = _paymentService;
  	}
  	
  	
  	//Field Injection, hard to test
  	@Autowired
  	PaymentService paymentService1;
}
