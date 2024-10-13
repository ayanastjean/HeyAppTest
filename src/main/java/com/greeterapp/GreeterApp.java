package com.greeterapp;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class GreeterApp {

    public static void main(String[] args) {
        // today
        LocalDate today = LocalDate.now();
        // halloween
        LocalDate halloween = getHalloweenDate(today);

        // count days until
        long daysUntilHalloween = ChronoUnit.DAYS.between(today, halloween);

        // countdown message
        System.out.println("Hiya! There are " + daysUntilHalloween + " days until Halloween! Eeeeeeeek!");
    }

    // halloween
    public static LocalDate getHalloweenDate(LocalDate today) {
        LocalDate halloween = LocalDate.of(today.getYear(), 10, 31);

        // Halloween of next year
        if (today.isAfter(halloween)) {
            halloween = halloween.plusYears(1);
        }

        return halloween;
    }

    // calculate days until Halloween
    public static long daysUntilHalloween() {
        LocalDate today = LocalDate.now();
        LocalDate halloween = getHalloweenDate(today);
        return ChronoUnit.DAYS.between(today, halloween);
    }
}

