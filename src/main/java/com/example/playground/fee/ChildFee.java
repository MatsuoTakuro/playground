package com.example.playground.fee;

import com.example.playground.Money;

public class ChildFee implements Fee {

    static final double CHILD_RATE = 0.5;

    @Override
    public Money money() {
        double tmpBabyFee = BaseFee.BASE_FEE * CHILD_RATE;
        int babyFee = (int) Math.round(tmpBabyFee);
        return new Money(babyFee);
    }

    @Override
    public String label() {
        return "Baby";
    }
}
