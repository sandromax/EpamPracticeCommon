package com.maksymenko.epam.external.practice.steamapi9.task92;

import java.util.Arrays;
import java.util.Random;

public class StringLambdaArrayCompare {
    private static final String[] MILLITARY_ALPHABET = {"Alpha", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot", "Golf", "Hotel", "India", "Juliet", "Kilo", "Lima", "Mike", "November", "Oscar", "Papa", "Quebec", "Romeo", "Sierra", "Tango", "Uniform", "Victor", "Whiskey", "X-Ray", "Yankee", "Zulu"};

    public static String[] init(int capacity) {
        String[] result = new String[capacity];
        Random rand = new Random();

        for(int i = 0; i < result.length; i++) {
            result[i] = MILLITARY_ALPHABET[rand.nextInt(12)];
        }

        return result;
    }

    public static void show(String[] array) {
        System.out.println(array);

        for(String string : array) {
            System.out.print(string + ", ");
        }

        System.out.println();
    }

    public static void sort(String[] array) {
        Arrays.sort(array, (s1, s2) -> s2.compareTo(s1));
    }
}
