package com.teachmeskills.homework10.part1;
//Проверить содержит ли номер документа последовательность "abc"
// и вывести сообщение содержит или нет (причем, abc и ABC считается одинаковой последовательностью)
public class Homework10_5 {
    public static void main(String[] args) {
        String i = "1111-qQq-2222-QqQ-1q2Q";
        System.out.println(i.toLowerCase().contains("abc"));
    }
}
