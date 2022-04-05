package com.example.playground.fee;

public enum FeeType {
    adult,
    child,
    senior
}

class Guest {
    FeeType type;

    boolean isAdult() {
        return type.equals(FeeType.adult);
    }
}
