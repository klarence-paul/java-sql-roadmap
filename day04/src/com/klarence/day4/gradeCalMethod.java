package com.klarence.day4;

import java.util.Scanner;

public class gradeCalMethod {

    public static char calculateGrade(int score) {
        
        int bucket = score/10;
        char grade = switch (bucket){
            case 10,9 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            case 6 -> 'D';
            default -> 'F';
       };
        return grade;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your score (0-100): ");
        int score = scanner.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("Invalid score");
            scanner.close();
            return;
        }

        char grade = calculateGrade(score);
        System.out.println("Your grade is: " + grade);

    }
}