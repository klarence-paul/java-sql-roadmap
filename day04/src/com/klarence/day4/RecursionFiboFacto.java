package com.klarence.day4;

import java.util.Scanner;

public class RecursionFiboFacto {

    public static int factorial(int num){

        if(num == 0 || num == 1){
            return 1;
        } else {
            return num * factorial(num-1);
        }
    }

    public static int factorialIterative(int n) {
    // use a for or while loop instead of recursion
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int itnum = scanner.nextInt();
        int itfactorialResult = factorialIterative(itnum);
        System.out.println("itFactorial of " + itnum + " is: " + itfactorialResult);

        System.out.print("Enter a number to calculate its factorial: ");
        int num = scanner.nextInt();
        int factorialResult = factorial(num);
        System.out.println("Factorial of " + num + " is: " + factorialResult);

        System.out.print("Enter a number to calculate its Fibonacci: ");
        int fibNum = scanner.nextInt();
        int fibonacciResult = fibonacci(fibNum);
        System.out.println("Fibonacci of " + fibNum + " is: " + fibonacciResult);

        scanner.close();
    }
}
