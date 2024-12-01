package com.greeterapp;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class GreeterApp {

    public static void main(String[] args) {
        // today
        LocalDate today = LocalDate.now();
        // Christmas
        LocalDate christmas = getChristmasDate(today);

        // count days until
        long daysUntilChristmas = ChronoUnit.DAYS.between(today, christmas);

        // countdown message
        System.out.println("Hello Earthling! There are " + daysUntilChristmas + " days until Halloween! ");
    }

    // Christmas date
    public static LocalDate getChristmasDate(LocalDate today) {
        LocalDate christmas = LocalDate.of(today.getYear(), 10, 31);

        // Christmas of next year
        if (today.isAfter(christmas)) {
            christmas = christmas.plusYears(1);
        }

        return christmas;
    }

    // calculate days until Christmas
    public static long daysUntilChristmas() {
        LocalDate today = LocalDate.now();
        LocalDate christmas = getChristmasDate(today);
        return ChronoUnit.DAYS.between(today, christmas);
    }
}
