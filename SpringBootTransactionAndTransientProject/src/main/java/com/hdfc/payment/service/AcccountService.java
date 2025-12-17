package com.hdfc.payment.service;

import org.springframework.stereotype.Service;

import com.hdfc.payment.entities.AccountEntity;
import com.hdfc.payment.request.AccountRequest;
import com.hdfc.payment.request.PaymentRequest;

@Service
public interface AcccountService {

	AccountEntity createAccount(AccountRequest accountRequest);
	AccountEntity doPayment(PaymentRequest paymentRequest);
}
