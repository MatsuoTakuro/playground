package com.example.playground.fee;

import com.example.playground.Money;

public enum FeeType {
    adult( new AdultFee()),
    child( new ChildFee()),
    senior( new SeniorFee());

    private Fee fee;
    private FeeType(Fee fee) {
        this.fee =fee;
    }

    Money money() {
        return this.fee.money();
    }

    String label() {
        return this.fee.label();
    }

    public static Money feeFor(String feeTypeName) {
        FeeType feeType = FeeType.valueOf(feeTypeName);

        return feeType.money();
    }
}
