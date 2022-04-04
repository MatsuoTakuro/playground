package com.example.playground;

public class Fee {
    static final int BASE_FEE = 1000;
    static final double BABY_RATE = 0.3;
    static final double CHILD_RATE = 0.5;
    static final double SENIOR_RATE = 0.7;


    Money babyFee() {
        double tmpBabyFee = BASE_FEE * BABY_RATE;
        int babyFee = (int) Math.round(tmpBabyFee);
        return new Money(babyFee);
    }

    Money childFee() {
        double tmpChildFee = BASE_FEE * CHILD_RATE;
        int childFee = (int) Math.round(tmpChildFee);
        return new Money(childFee);
    }

    Money adultFee() {
        return new Money(BASE_FEE);
    }

    Money seniorFee() {
        double tmpSeniorFee = BASE_FEE * SENIOR_RATE;
        int seniorFee = (int) Math.round(tmpSeniorFee);
        return new Money(seniorFee);
    }
}
