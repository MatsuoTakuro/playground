package com.example.playground.application.scenario;

import com.example.playground.application.scenario.service.BankAccountService;
import com.example.playground.application.scenario.service.BankAccountUpdateService;
import com.example.playground.domain.Amount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankAccountScenario {

    @Autowired
    BankAccountService queryService;
    @Autowired
    BankAccountUpdateService updateService;

    Amount withdraw(Amount amount) {
        if (! queryService.canWithdraw(amount))
            throw new IllegalStateException("insufficient balance");
        updateService.withdraw(amount);
        return queryService.balance();
    }
}
