package com.klarence.day05;

public class CrashTest {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

    try{
        System.out.println(numbers[5]);
    } catch (ArrayIndexOutOfBoundsException e)
    {
        System.out.println("Array index is out of bounds!");
        System.out.println("Error: " + e.getMessage());
    }
       System.out.println("Continue the program..."); 
    }
}