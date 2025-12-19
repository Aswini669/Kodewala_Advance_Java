package com.pnb.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pnb.bank.entities.Account;
import com.pnb.bank.repository.FundTransferRepo;
import com.pnb.bank.request.TranferRequest;

@Service
public class FundTransferServiceImplementation implements FundTransferService{

	@Autowired
	FundTransferRepo fundTransferRepo;
	
	@Override
	public String doFundTransfer(TranferRequest request) {
		
		int amountToBeTransfered = request.getAmount();
		
		
		String fromAccountNumber = request.getFromAccount();   //get the account number here fromAccount
		System.out.println(fromAccountNumber);
		Account fromAccount = fundTransferRepo.findByAccountNo(fromAccountNumber).get();
		System.out.println(fromAccount);
		fromAccount.setBalance(fromAccount.getBalance() - amountToBeTransfered);
		fundTransferRepo.save(fromAccount);
		
		String toAccountNumber = request.getToAccount();   //get the account number here fromAccount
		Account toAccount = fundTransferRepo.findByAccountNo(toAccountNumber).get();
		toAccount.setBalance(toAccount.getBalance() + amountToBeTransfered);
		toAccount.setPassword("aaaaaaa");
		fundTransferRepo.save(toAccount);
		
		return "Fund has been tranfered successfully...";
	}

}
