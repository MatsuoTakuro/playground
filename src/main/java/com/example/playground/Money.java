package com.example.playground;

public class Money {

    static final  int MIN = 0;

    public Money() {
        this.amount = 0;
    }

    int amount;
    public Money(int amount) {
        if (amount < MIN) throw new
                IllegalArgumentException("illegal: " + "less than " + MIN);
        this.amount = amount;
    }

//  Minus receives int value as arg and create an instance with it by constructor, Unlike the case of Quantity#add
    Money minus(int amount) {
        Money other = new Money(amount);
        if (!canMinus(other)) throw  new
                IllegalArgumentException("illegal: " + "balance is less than" + MIN);
        int balance = minusAmount(other);
        return new Money(balance);
    }

    Money add(int amount) {
        Money other = new Money(amount);
        int total = addAmount(other);
        return new Money(total);
    }

    boolean canMinus(Money other) {
        int balance = minusAmount(other);
        return  balance > MIN;
    }

    private int minusAmount(Money other) {
        return this.amount - other.amount;
    }

    private int addAmount(Money other) {
        return this.amount + other.amount;
    }
}
