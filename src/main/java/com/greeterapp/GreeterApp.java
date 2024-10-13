package com.greeterapp;

import java.util.Scanner;

public class GreeterApp {

    // This method returns a greeting message for the given name
    public String greet(String name) {
        return "Hey, " + name + "! What's going on?";
    }

    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Ask for the user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Create an instance of GreeterApp and call the greet method
        GreeterApp greeter = new GreeterApp();
        System.out.println(greeter.greet(name));

        // Close the Scanner object
        scanner.close();
    }
}
