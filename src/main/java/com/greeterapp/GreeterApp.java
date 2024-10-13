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

        // Display the countdown message
        System.out.println("Hey! There are " + daysUntilHalloween + " days until Halloween!");
    }

    // Method to get the date of Halloween
    public static LocalDate getHalloweenDate(LocalDate today) {
        LocalDate halloween = LocalDate.of(today.getYear(), 10, 31);

        // If Halloween has passed this year, return Halloween of next year
        if (today.isAfter(halloween)) {
            halloween = halloween.plusYears(1);
        }

        return halloween;
    }

    // Method to calculate days until Halloween
    public static long daysUntilHalloween() {
        LocalDate today = LocalDate.now();
        LocalDate halloween = getHalloweenDate(today);
        return ChronoUnit.DAYS.between(today, halloween);
    }
}

