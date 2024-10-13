package com.greeterapp;

public class GreeterApp {
    public static void main(String[] args) {
        // Call the greet method
        String userName = "User"; // Default name if no input is provided
        String date = java.time.LocalDate.now().toString();
        System.out.println(greet(userName, date));
    }

    public static String greet(String userName, String date) {
        return "Hey " + userName + "! It is " + date + ". Hope all is well.";
    }
}
