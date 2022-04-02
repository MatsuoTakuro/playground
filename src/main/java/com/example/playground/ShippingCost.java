package com.example.playground;

import java.lang.reflect.Constructor;

public class ShippingCost {
    static final int minimumForFree = 3000;
    static final int cost = 500;

    int basePrice;
//  custom constructor
    ShippingCost(int basePrice) {
        this.basePrice = basePrice;
    }

    int amount () {
        if(basePrice < minimumForFree) return cost;
        return  0;
    }
}
