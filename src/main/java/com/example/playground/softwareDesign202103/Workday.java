package com.example.playground.softwareDesign202103;

import java.time.LocalDate;

public class Workday implements Comparable<Workday> {
    LocalDate date;

    public Workday(LocalDate date) {
        this.date = date;
    }

    @Override
    public int compareTo(Workday other) {
        return date.compareTo(other.date);
    }

    @Override
    public boolean equals(Object object) {
        Workday other = (Workday) object;
        return date.equals(other.date);
    }

    @Override
    public int hashCode() {
        return date.hashCode();
    }
}
