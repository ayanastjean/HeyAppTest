package com.greeterapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AppTest {

    @Test
    public void testDaysUntilChristmas() {
        // Create an instance of GreeterApp
        GreeterApp greeter = new GreeterApp();
        LocalDate today = LocalDate.now();
        LocalDate christmas = greeter.getChristmasDate(today);

        // Calculate expected days until Christmas
        long expectedDays = ChronoUnit.DAYS.between(today, christmas);
        long actualDays = greeter.daysUntilChristmas();

        // Assert the calculated days match the expected days
        assertEquals(expectedDays, actualDays);
    }
}
