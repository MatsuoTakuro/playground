package com.example.playground.fee;

import com.example.playground.Money;

public class AdultFee implements Fee {

    @Override
    public Money money() {
        return new Money(BaseFee.BASE_FEE);
    }

    @Override
    public String label() {
        return "Adult";
    }
}
