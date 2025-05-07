package com.banksphereom.service;

import com.banksphereom.model.Account;
import com.banksphereom.model.Transaction;
import com.banksphereom.repository.AccountRepository;
import com.banksphereom.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountService {
    @Autowired private AccountRepository accountRepo;
    @Autowired private TransactionRepository txRepo;

    public Account getAccount(String accNum) {
        return accountRepo.findByAccountNumber(accNum);
    }

    @Transactional
    public Account deposit(String accNum, Double amt) {
        Account acc = accountRepo.findByAccountNumber(accNum);
        acc.setBalance(acc.getBalance() + amt);
        accountRepo.save(acc);
        Transaction tx = new Transaction(); tx.setAccountNumber(accNum); tx.setType("DEPOSIT"); tx.setAmount(amt);
        txRepo.save(tx);
        return acc;
    }
}
