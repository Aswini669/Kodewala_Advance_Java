package com.pnb.bank.service;

import org.springframework.stereotype.Service;

import com.pnb.bank.request.TranferRequest;

@Service
public interface FundTransferService {

	String doFundTransfer(TranferRequest request);
}
