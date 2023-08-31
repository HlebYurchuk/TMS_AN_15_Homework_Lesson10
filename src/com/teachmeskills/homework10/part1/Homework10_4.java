package com.teachmeskills.homework10.part1;
//Вывести на экран буквы из номера документа в формате "Letters:yyy//yyy/y/y" в верхнем
// регистре (Реализовть с помощью класса StringBuilder
public class Homework10_4 {
    public static void main(String[] args) {
        StringBuilder i1 = new StringBuilder("1111-qWe-2222-RtY-1q2R");
        i1.delete(0,5);
        i1.delete(4,9);
        i1.delete(8,9);
        i1.replace(3,4, "/");
        i1.replace(7,8, "/");
        i1.replace(9,10, "/");
        System.out.println("Letters:"+i1);

    }
}

