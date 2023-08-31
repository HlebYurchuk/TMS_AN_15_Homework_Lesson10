package com.teachmeskills.homework10.part1;
//Вывести на экран номер документа, но блоки из трёх букв заменить на ***(каждая буква заменяется на *)
public class Homework10_2 {
    public static void main(String[] args) {
        String i = "1111-qWe-2222-RtY-1q2R";
        System.out.println(i.toLowerCase().replaceAll("[a-zA-Z]","*"));
    }
}
