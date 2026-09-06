package com.klarence.day05;

public class MultiCatch {
    public static void main(String[] args) {


        System.out.println(10.0 / 0);
        System.out.println(-10.0 / 0);
        System.out.println(0.0 / 0);
        
        // 1. Trigger ArithmeticException — divide by zero
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero: " + e.getMessage());
        }

        // 2. Trigger NumberFormatException — parsing bad text as a number
        try {
            int number = Integer.parseInt("abc");
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("That's not a valid number: " + e.getMessage());
        }

        double result = 10.0 / 0;
        if (Double.isInfinite(result) || Double.isNaN(result)) {
            System.out.println("Invalid calculation result!");
        }

        System.out.println("Program finished without crashing.");
    }
}
