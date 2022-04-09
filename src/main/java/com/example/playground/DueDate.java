package com.example.playground;

import java.time.LocalDate;

public class DueDate {
    LocalDate dueDate;

    boolean isExpired() {
        return false;
    }

    boolean isExpiredOn(LocalDate date) {
        return false;
    }

    int remainingDays() {
        return 0;
    }

    AlertType alertPriority() {
        if (remainingDays() <= 0) {return AlertType.EXPIRED; }
        if (0 < remainingDays() && remainingDays() <= 3) {return AlertType.ALERT; }
        if (3 < remainingDays() && remainingDays() <= 7) {return AlertType.WARNING; }
        if (7 < remainingDays() && remainingDays() <= 14) {return AlertType.ATTENTION; }

        return AlertType.NOTICE;
    }
}
