package com.klarence.day6;

import java.util.Scanner;

public class EmailValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an email address: ");
        String email = scanner.nextLine();
        isValidEmail(email);
        scanner.close();
    }

    public static void isValidEmail(String email) {
    email = email.trim();
    email = email.toLowerCase();

    int atIndex = email.indexOf("@");

    if (atIndex == -1) {
        System.out.println("Invalid email: missing @ symbol.");
        return;
    }


    if (atIndex != email.lastIndexOf("@")) {
        System.out.println("Invalid email: more than one @ symbol.");
        return;
    }

    String username = email.substring(0, atIndex);
    String domain = email.substring(atIndex + 1);


    if (username.isEmpty() || domain.isEmpty()) {
        System.out.println("Invalid email: missing username or domain.");
        return;
    }

    if (domain.indexOf(".") == -1) {
      System.out.println("Invalid email: domain needs a dot (like gmail.com).");
      return;
    }


    System.out.println("Cleaned email: " + email);
    System.out.println("Username: " + username);
    System.out.println("Domain: " + domain);
}


}