package com.example.playground.softwareDesign202103;

import java.time.MonthDay;
import java.time.format.DateTimeFormatter;

public class Season {
    static DateTimeFormatter dft = DateTimeFormatter.ofPattern("MM-dd");
    MonthDay start;
    MonthDay end;

    private Season(MonthDay start, MonthDay end) {
        this.start = start;
        this.end = end;
    }

    static Season of(String start, String end) {
        final MonthDay convStart = MonthDay.parse(start, dft);
        final MonthDay convEnd = MonthDay.parse(end, dft);
        return new Season(convStart, convEnd);
    }

    boolean contains(MonthDay monthDay) {
        if (monthDay.isBefore(start)) return false;
        if (monthDay.isAfter(end)) return false;
        return true;
    }
}
