package com.klarence.day3;

import java.util.Scanner;

public class ArrayModification {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        if (size <= 0){
            System.out.print("Invalid size. Please enter a positive integer.");
            scanner.close();
            return;
         }

         int[] array = new int[size];

         System.out.print ("Enter " + size + " integers: " );

         for (int  i = 0; i < size; i++){
            array[i] = scanner.nextInt();
         }

         int maxVal = array[0];
         int minVal = array[0];
        
        for (int i = 0; i < size; i++){
            if (array[i] > maxVal){
                maxVal = array[i];
            }    
            if (array[i] < minVal){
                minVal = array[i];
            }
        }

        double average = 0;

        for (int i = 0; i < size; i++){
            average += array[i];
        }
        average /= size;

        scanner.close();

        System.out.println("Maximum value: " + maxVal);
        System.out.println("Minimum value: " + minVal);
        System.out.println("Average value: " + average);
        }

}