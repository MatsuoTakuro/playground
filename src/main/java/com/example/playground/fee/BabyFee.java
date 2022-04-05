package com.example.playground.fee;

import com.example.playground.Money;

public class BabyFee  extends BaseFee implements Fee{

    static final double BABY_RATE = 0.3;

    @Override
    public Money money() {
        double tmpBabyFee = BASE_FEE * BABY_RATE;
        int babyFee = (int) Math.round(tmpBabyFee);
        return new Money(babyFee);
    }

    @Override
    public String label() {
        return "Baby";
    }
}
