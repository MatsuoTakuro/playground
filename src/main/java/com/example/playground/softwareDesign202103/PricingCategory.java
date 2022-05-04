package com.example.playground.softwareDesign202103;

import java.time.LocalDate;
import java.time.MonthDay;

public enum PricingCategory {
    END_OF_YEAR("12-25","12-25", 5000),
    NEW_YEAR("01-01","01-07", 5500),
    GOLDEN_WEEK("04-24","05-09", 4000),
    SUMMER("07-20","08-31", 4500),
    SILVER_WEEK("09-15","09-30", 3500),
    NORMAL("01-01","12-31", 2500)
    ;

    private Season season;
    private int price;

    PricingCategory(String start, String end, int price) {
        season = Season.of(start, end);
        this.price = price;
    }

    int price() {
        return this.price;
    }

    static PricingCategory of(LocalDate date) throws IllegalAccessException {
        MonthDay monthDay = MonthDay.from(date);
        for (PricingCategory each: values()) {
            if (each.season.contains(monthDay)) return each;
        }
        throw new IllegalAccessException("N/A");
    }
}
