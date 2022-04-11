package com.example.playground.repository;

import com.example.playground.domain.Amount;

public interface BankAccountRepository {
    Amount balance();
    void withdraw(Amount amount);
}
