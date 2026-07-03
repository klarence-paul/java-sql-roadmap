package com.klarence.day1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxie = Integer.MAX_VALUE;

        System.out.println(maxie);

        // This cause an overflow error and wraps around to the minimum value of the integer type
        System.out.println(maxie + 1);

        


        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your favorite number: ");
        int favNumber = scanner.nextInt();

        System.out.printf("Your name is %s and you are %d years old and your favorite number is %d.", name, age, favNumber);
        scanner.close();
    }
}