package com.example.playground.domain;

public class Amount {

    int amount;
    public Amount(int amount) {
        if (amount < 0) throw new IllegalArgumentException("amount is less than 0.");
        this.amount = amount;
    }

    public boolean has(Amount amount) {
        return this.amount >= amount.amount;
    }
}
