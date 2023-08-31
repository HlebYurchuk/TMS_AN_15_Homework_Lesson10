package com.teachmeskills.homework10.part2;

public class Methods {
    public static void longWord(String text) {
        String[] words = text.split(" ");

        String shortest = words[0];

        for (String word : words) {
            if (shortest.length() <= word.length()) {
                shortest = word;
            }
        }

        System.out.println("Длинное слово - " + shortest);
    }

    public static void shortWord(String text) {
        String[] words = text.split(" ");

        String shortest = words[0];

        for (String word : words) {
            if (shortest.length() >= word.length()) {
                shortest = word;
            }
        }

        System.out.println("Короткое слово - " + shortest);
    }
}

