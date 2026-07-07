package com.klarence.day2;

import java.util.Scanner;

public class GradeCalSwitch{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your score: ");
        int score = scanner.nextInt();

        if(score > 100 || score < 0){
            System.out.println("Invalid score. Please enter a score between 0 and 100.");
            scanner.close();
            return;
        }

        int bucket = score / 10;

        char grade = switch(bucket){
            case 10, 9 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            case 6 -> 'D';
            default -> 'F';
        };  

        System.out.println("Your grade is: " + grade);
        scanner.close();
    }
}