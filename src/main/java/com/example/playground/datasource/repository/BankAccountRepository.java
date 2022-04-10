package com.example.playground.datasource.repository;

import com.example.playground.domain.Amount;
import org.springframework.stereotype.Repository;

@Repository
public class BankAccountRepository {

    public Amount balance() {
        int tmpBalanceInDb = 100;
        return new Amount(tmpBalanceInDb);
    }

    public void withdraw(Amount amount) {}
}
