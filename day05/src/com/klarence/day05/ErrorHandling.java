package com.klarence.day05;

import java.util.Scanner;

public class ErrorHandling {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String input1 = scanner.nextLine();
        System.out.print("Enter a number: ");
        String input2 = scanner.nextLine();



        try{
            int numb1 = Integer.parseInt(input1);
            System.out.println("You entered: " + numb1);

            int numb2 = Integer.parseInt(input2);
            System.out.println("You entered: " + numb2);

               try {
                    int result = numb1 / numb2;
                     System.out.println("Result of division: " + result);
                }
                catch (ArithmeticException e) {
                    System.out.println("Error: Division by zero is not allowed.");
                } finally {
                            System.out.println("Execution completed.");
                     }

        
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } finally {
            scanner.close();
        }

    }

}