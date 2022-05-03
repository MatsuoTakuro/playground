package com.example.playground.softwareDesign202103;

import java.util.Objects;

public class Pair {
    Category category;
    DayType dayType;

    private Pair(Category category, DayType dayType) {
        this.category = category;
        this.dayType  = dayType;
    }

    static Pair of(Category category, DayType dayType) {
        return new Pair(category, dayType);
    }
}
