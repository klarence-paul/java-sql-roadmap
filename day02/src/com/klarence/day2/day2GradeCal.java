package com.klarence.day2;

import java.util.Scanner;

public class day2GradeCal{

    public static void main(String[] args){

         char grade = 'F';

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your score: ");
        double score = scanner.nextDouble();

       

        if(score > 100 || score < 0){
            System.out.println("Invalid score. Please enter a score between 0 and 100.");
            scanner.close();
            return;
        }
        else if(score >= 90){
            grade = 'A';
        }
        else if(score >= 80){
            grade = 'B';
        } 
        else if(score >= 70){
            grade = 'C';
        }
        else if(score >= 60){
            grade = 'D';
        }
        else if(score >= 0){
            grade = 'F';
        }

        System.out.println("Your grade is: " + grade);
        scanner.close();
    }
}