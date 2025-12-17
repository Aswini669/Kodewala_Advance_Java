package com.hdfc.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hdfc.payment.entities.AccountEntity;

@Repository
public interface AccountRepo extends JpaRepository<AccountEntity, Integer>{

	 public AccountEntity findByAccountNum(String accountNum);
}
