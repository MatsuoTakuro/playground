package com.example.playground;

public class TakeRate {
    static final double TAKERATE = 0.3;

    double takeRate;
    TakeRate() {
        this.takeRate = 1 - TAKERATE;
    }

    double getTakeRate() {
        return  this.takeRate;
    }
}
