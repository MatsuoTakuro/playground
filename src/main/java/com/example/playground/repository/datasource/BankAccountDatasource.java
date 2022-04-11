package com.example.playground.repository.datasource;

import com.example.playground.repository.BankAccountRepository;
import com.example.playground.domain.Amount;
import org.springframework.stereotype.Repository;

@Repository
public class BankAccountDatasource implements BankAccountRepository {

    public Amount balance() {
        int tmpBalanceInDb = 100;
        return new Amount(tmpBalanceInDb);
    }

    public void withdraw(Amount amount) {}
}
