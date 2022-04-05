package com.example.playground.fee;

import com.example.playground.customer.CustomerType;

import java.util.HashMap;
import java.util.Map;

public class FeeFactory {
    static Map<CustomerType,Fee> types;

    static
    {
        types = new HashMap<>();
        types.put(CustomerType.BABY, new BabyFee());
        types.put(CustomerType.CHILD, new ChildFee());
        types.put(CustomerType.ADULT, new AdultFee());
        types.put(CustomerType.SENIOR, new SeniorFee());
    }

    public static Fee feeByName(CustomerType name) {
        return types.get(name);
    }
}
