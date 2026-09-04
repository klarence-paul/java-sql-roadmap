package com.klarence.day3;

public class Reference{

    public static void doubleFirstElement (int[] array){
     array[0] *= 2;
}

    public static void main(String[] args){

        int[] array = {5, 10, 15};

        System.out.println("Before modification: " + array[0]);
        doubleFirstElement(array);
        System.out.println("After modification: " + array[0]);
    }
}


