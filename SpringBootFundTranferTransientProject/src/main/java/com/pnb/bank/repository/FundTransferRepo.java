package com.pnb.bank.repository;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pnb.bank.entities.Account;

@Repository
public interface FundTransferRepo extends CrudRepository<Account, Integer>
{
	Optional<Account> findByAccountNo(String accountNo);
}
