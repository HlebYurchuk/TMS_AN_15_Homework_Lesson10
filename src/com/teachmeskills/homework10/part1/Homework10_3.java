package com.teachmeskills.homework10.part1;
//Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y
public class Homework10_3 {
    public static void main(String[] args) {
        //Сразу сделал через StringBuffer(StringBuilder)
        StringBuffer i1 = new StringBuffer("1111-qWe-2222-RtY-1q2R");
        i1.delete(0,5);
        i1.delete(4,9);
        i1.delete(8,9);
        i1.replace(3,4, "/");
        i1.replace(7,8, "/");
        i1.replace(9,10, "/");
        System.out.println(i1);

    }
}