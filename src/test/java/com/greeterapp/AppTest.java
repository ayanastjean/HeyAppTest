package com.greeterapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AppTest {

    @Test
    public void testDaysUntilHalloween() {
        GreeterApp greeter = new GreeterApp();
        LocalDate today = LocalDate.now();
        LocalDate halloween = greeter.getHalloweenDate(today);

        long expectedDays = ChronoUnit.DAYS.between(today, halloween);
        long actualDays = greeter.daysUntilHalloween();

        assertEquals(expectedDays, actualDays);
    }
}
