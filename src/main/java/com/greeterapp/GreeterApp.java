package com.greeterapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class GreeterApp {
    private static final Logger logger = LoggerFactory.getLogger(GreeterApp.class);

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate christmas = getChristmasDate(today);
        long daysUntilChristmas = ChronoUnit.DAYS.between(today, christmas);

        logger.info("Application started. Calculating days until Christmas...");
        logger.info("Hello Earthling! There are {} days until Christmas!", daysUntilChristmas);

        // Keep the application running
        try {
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException e) {
            logger.error("Application interrupted!", e);
        }
    }

    // Method to get the next Christmas date
    public static LocalDate getChristmasDate(LocalDate today) {
        LocalDate christmas = LocalDate.of(today.getYear(), 12, 25);

        // If today is after Christmas, calculate for next year
        if (today.isAfter(christmas)) {
            christmas = christmas.plusYears(1);
        }

        return christmas;
    }
}
