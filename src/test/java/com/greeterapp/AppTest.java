package com.greeterapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testGreet() {
        GreeterApp greeter = new GreeterApp();
        String date = java.time.LocalDate.now().toString(); // Get today's date
        String expected = "Hey Ayana! It is " + date + ". Hope all is well."; // Expected output
        String actual = greeter.greet("Ayana", date); // Call the greet method with parameters
        assertEquals(expected, actual);
    }
}
