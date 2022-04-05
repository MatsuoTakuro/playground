package com.example.playground.fee;

import com.example.playground.Money;

public class AdultFee extends BaseFee implements Fee  {

    @Override
    public Money money() {
        return new Money(BASE_FEE);
    }

    @Override
    public String label() {
        return "Adult";
    }
}
