package com.greeterapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testGreet() {
        GreeterApp greeter = new GreeterApp();
        String expected = "Hiya, Ayana! What's going on?";
        String actual = greeter.greet("Ayana");
        assertEquals(expected, actual);
    }
}
