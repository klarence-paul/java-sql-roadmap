package com.klarence.day2;

import java.util.Scanner;

public class DayTwop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;

        System.out.print("Enter your Number: ");
        a = scanner.nextInt();

        int b = a % 2;

        if (b == 0) {
            System.out.println(a + " is even.");
        }
        else {
            System.out.println(a + " is odd.");
        }

        scanner.close();
    }
}