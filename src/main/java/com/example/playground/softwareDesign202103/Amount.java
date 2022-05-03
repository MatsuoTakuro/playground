package com.example.playground.softwareDesign202103;

public class Amount {
    int value;

    Amount(int value) {
        this.value = value;
    }

    int plus(int other) {
        return value + other;
    }
}
