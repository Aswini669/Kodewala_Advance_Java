package com.pnb.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pnb.bank.request.TranferRequest;
import com.pnb.bank.service.FundTransferService;

@RestController
public class FundTransferController {

	@Autowired
	FundTransferService fundTransferService;
	
	@PostMapping("transferMoney")
	public String tranferFund(@RequestBody TranferRequest request) {
		String response = fundTransferService.doFundTransfer(request);
		return response;
	}
}
