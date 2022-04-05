package com.example.playground;

import com.example.playground.fee.Fee;

public class Charger {

    Fee fee;
    Charger(Fee fee) {
        this.fee = fee;
    }

    Money money() {
        return fee.money();
    }
}
