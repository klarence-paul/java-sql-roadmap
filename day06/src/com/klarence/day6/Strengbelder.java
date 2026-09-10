package com.klarence.day6;

public class Strengbelder {
    public static void main(String[] args) {

        String[] words = {"Java", "is", "getting", "easier", "every", "day"};
        

        StringBuilder sb = new StringBuilder();
            for (String word : words) {
                sb.append(word).append(" ");
            }
                System.out.println(sb.toString());
    }
}