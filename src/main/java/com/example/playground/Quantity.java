package com.example.playground;

public class Quantity {
    static final  int MIN = 1;
    static final int MAX = 100;

    int value;

    Quantity(int value) {
        if (value < MIN) throw new
                IllegalArgumentException("illegal: " + "less than " + MIN);
        if (value > MAX) throw new
                IllegalArgumentException("illegal: " + "more than " + MAX);
        this.value = value;
    }

    Quantity add(Quantity other) {
        if (!canAdd(other)) throw new
                IllegalArgumentException("illegal: " + "total is more than " + MAX);
        int addedTotal = addValue(other);
        return new Quantity(addedTotal);
    }

    boolean canAdd(Quantity other) {
        int total = addValue(other);
        return total <= MAX;
    }

    private int addValue(Quantity other) {
        return this.value + other.value;
    }
}
