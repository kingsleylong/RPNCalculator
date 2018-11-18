package org.klong;

import org.klong.application.CommandLineCalculator;

import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        CommandLineCalculator calculator = new CommandLineCalculator();
        try {
            System.out.println("Calculator started.");
            calculator.waitForInput();
        } catch (IOException e) {
            System.out.println("Application start with error: " + e.getMessage());
        }
    }
}
