package com.example.playground.application.scenario.service;

import com.example.playground.domain.Amount;
import com.example.playground.repository.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankAccountService {
    @Autowired
    BankAccountRepository repository;

    public Amount balance() {
        return repository.balance();
    }

    public boolean canWithdraw(Amount amount) {
        Amount balance = balance();
        return balance.has(amount);
    }
}

