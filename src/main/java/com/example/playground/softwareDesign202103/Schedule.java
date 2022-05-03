package com.example.playground.softwareDesign202103;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Schedule {
    SortedSet<Workday> schedule;

    Schedule(SortedSet<Workday> schedule) {
        this.schedule = schedule;
    }

    Schedule add(Workday workday) {
        SortedSet result = new TreeSet<Workday>(schedule);
        result.add(workday);
        return new Schedule(result);
    }

    List<Workday> schedules(Workday workday) {
        return new ArrayList<>(schedule.tailSet(workday));
    }

    void show() {
        System.out.println("All scheduled workdays are following;");
        for (Workday each: schedule) {
            System.out.println(each.date);
        }
    }
}
