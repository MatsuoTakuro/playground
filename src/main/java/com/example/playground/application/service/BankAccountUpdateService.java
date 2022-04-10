package com.example.playground.application.service;


import com.example.playground.datasource.repository.BankAccountRepository;
import com.example.playground.domain.Amount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankAccountUpdateService {
    @Autowired
    BankAccountRepository repository;

    public void withdraw(Amount amount) {
        repository.withdraw(amount);
    }
}
