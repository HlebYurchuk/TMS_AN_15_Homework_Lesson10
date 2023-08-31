package com.teachmeskills.homework10.part3;

public class Homework10_8 {
    public static void main(String[] args) {
        String str = "Hello";

        char[] arrayString =str.toCharArray();
        StringBuilder doubleLetter = new StringBuilder();

       for (char i : arrayString) {
           doubleLetter.append(i);
           doubleLetter.append(i);
        }
        System.out.println(doubleLetter);
    }
}
