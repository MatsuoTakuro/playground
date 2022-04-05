package com.example.playground.fee;

import com.example.playground.Money;

public class SeniorFee implements Fee {

    static final double SENIOR_RATE = 0.7;

    @Override
    public Money money() {
        double tmpBabyFee = BaseFee.BASE_FEE * SENIOR_RATE;
        int babyFee = (int) Math.round(tmpBabyFee);
        return new Money(babyFee);
    }

    @Override
    public String label() {
        return "Senior";
    }
}
