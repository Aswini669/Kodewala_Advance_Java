package com.hdfc.payment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdfc.payment.entities.AccountEntity;
import com.hdfc.payment.exception.AccountNotFoundException;
import com.hdfc.payment.exception.InsufficientBalanceException;
import com.hdfc.payment.repository.AccountRepo;
import com.hdfc.payment.request.AccountRequest;
import com.hdfc.payment.request.PaymentRequest;

import jakarta.transaction.Transactional;

@Service
public class AcccountServiceImplementation implements AcccountService{

	@Autowired
	AccountRepo accountRepo;
	
	@Override
	public AccountEntity createAccount(AccountRequest accountRequest) {
		AccountEntity accountEntity = new AccountEntity();
		accountEntity.setAccountNum(accountRequest.getAccountNum());
		accountEntity.setAmount(accountRequest.getAmount());
		accountEntity.setPanNum(accountRequest.getPanNum());
		accountEntity.setMobiNum(accountRequest.getMobiNum());
		accountEntity.setPassword(accountRequest.getPassword());
		AccountEntity result = accountRepo.save(accountEntity);
		return result;
	}

	@Transactional
	@Override
	public AccountEntity doPayment(PaymentRequest paymentRequest) {
		double amountToBeTransfer = paymentRequest.getAmmount();
		String fromAccountNumber = paymentRequest.getFromAccount();
		
		AccountEntity fromAccountDetails = accountRepo.findByAccountNum(fromAccountNumber);
		
		//Exception
		System.out.println(fromAccountDetails.getAmount());
		if(fromAccountDetails.getStatus().equalsIgnoreCase("DEACTIVE")) {
			throw new AccountNotFoundException("Active Your Account");
		}
		
		//Exception
		if(amountToBeTransfer > fromAccountDetails.getAmount()) {
			throw new InsufficientBalanceException("Money is ended");
		}
		
		fromAccountDetails.setAmount(fromAccountDetails.getAmount() - amountToBeTransfer);
		accountRepo.save(fromAccountDetails);
		
		String toAccNumber = paymentRequest.getToAccount();
		AccountEntity toAccDetails = accountRepo.findByAccountNum(toAccNumber);
		
		//Exception
		if(toAccDetails == null) { 
			throw new AccountNotFoundException("Account Not Exist");
		}
		
		//Exception
		if(toAccDetails.getStatus().equalsIgnoreCase("DEACTIVE")) {
			throw new AccountNotFoundException("Active Your Account");
		}
		
		toAccDetails.setAmount(toAccDetails.getAmount() + amountToBeTransfer);
		accountRepo.save(toAccDetails);
		
		AccountEntity result1 = accountRepo.findByAccountNum(fromAccountNumber);
		System.out.println(result1.getPassword());
		
		return result1;
	}

}
