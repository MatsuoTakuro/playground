package com.example.playground.softwareDesign202103;

import java.util.Objects;

@Deprecated
public class ExtendedAmount extends Amount {

    ExtendedAmount(int value) {
        super(value);
    }

    @Override
    int plus(int other) {
        if (other < 0) throw new IllegalArgumentException("argument is not positive.");
        return super.plus(other);
    }

    int minus(int other) {
        return super.value - other;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public boolean equals(Object object) {
        Amount other = (Amount) object;
        return value == other.value;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
