package com.klarence.day2;

import java.util.Scanner;

public class UserLog{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String correctUsername = "admin";
        String correctPassword = "1234";
        int attempts = 0;
        boolean loggedIn = false;

        while (attempts < 3) {
            // ask for username and password using Scanner
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            // if both match correctUsername and correctPassword:
            if(username.equals(correctUsername) && password.equals(correctPassword)){
                System.out.println("Login successful!");
                loggedIn = true;
                break;
            }
            else{
                attempts++;
                System.out.println("Invalid username or password. Attempts remaining: " + (3 - attempts));
            }
            // else:
            //     increment attempts
            //     print how many attempts remain
        }

            if(!loggedIn){
                System.out.println("Account locked. Please contact administrator.");
            }
        scanner.close();
    }
}