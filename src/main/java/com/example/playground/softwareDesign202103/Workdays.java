package com.example.playground.softwareDesign202103;

import java.util.List;

public class Workdays {
    List<Workday> workdays;

    Workdays(List<Workday> workdays) {
        this.workdays = workdays;
    }

    void show() {
        System.out.println("All workdays are following;");
        for (Workday each: workdays) {
            System.out.println(each.date);
        }
    }
}
