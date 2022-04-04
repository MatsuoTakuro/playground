package com.example.playground;

public class TakeRate {
    static final double TAKE_RATE = 0.3;

    double takeRate;
    TakeRate() {this.takeRate = 1 - TAKE_RATE; }

    double getTakeRate() {
        return  this.takeRate;
    }
}
