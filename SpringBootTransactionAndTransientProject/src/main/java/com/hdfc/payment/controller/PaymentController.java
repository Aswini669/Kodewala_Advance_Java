package com.hdfc.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hdfc.payment.entities.AccountEntity;
import com.hdfc.payment.request.AccountRequest;
import com.hdfc.payment.request.PaymentRequest;
import com.hdfc.payment.service.AcccountService;

@RestController
public class PaymentController {

	@Autowired
	AcccountService accouAcccountService;
	
	@PostMapping("createAccount")
	public AccountEntity createAccount(@RequestBody AccountRequest accountRequest) {
		System.out.println("Account Number: " + accountRequest.getAccountNum());
		AccountEntity result = accouAcccountService.createAccount(accountRequest);
		return result;
	}
	
	@GetMapping("moneyTransfer")
	public AccountEntity fundTransfer(@RequestBody PaymentRequest paymentRequest) {
		AccountEntity result = accouAcccountService.doPayment(paymentRequest);
		return result;
	}
}
