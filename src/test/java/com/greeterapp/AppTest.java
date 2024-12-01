package com.greeterapp;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreeterAppTest {

    @Test
    void testGetChristmasDateBeforeChristmas() {
        LocalDate today = LocalDate.of(2024, 12, 1);
        LocalDate expected = LocalDate.of(2024, 12, 25);
        assertEquals(expected, GreeterApp.getChristmasDate(today));
    }

    @Test
    void testGetChristmasDateAfterChristmas() {
        LocalDate today = LocalDate.of(2024, 12, 26);
        LocalDate expected = LocalDate.of(2025, 12, 25);
        assertEquals(expected, GreeterApp.getChristmasDate(today));
    }
}
