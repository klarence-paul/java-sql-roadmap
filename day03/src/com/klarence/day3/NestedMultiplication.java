package com.klarence.day3;

import java.util.Scanner;

public class NestedMultiplication {
 
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

    System.out.print("Enter table size (nxn): ");
    int size = scanner.nextInt();

    for(int i = 1; i <= size; i++){
        for(int j = 1; j <= size; j++){
            System.out.print(i + " x " + j + " = " + (i*j) + "\t");
        }
      System.out.println();  
    }
    


    }
}