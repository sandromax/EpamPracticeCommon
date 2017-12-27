package com.maksymenko.epam.external.practice.steamapi9.task93;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class StringLambdaArray {
    private static final String[] MILLITARY_ALPHABET = {"Alpha", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot", "Golf", "Hotel", "India", "Juliet", "Kilo", "Lima", "Mike", "November", "Oscar", "Papa", "Quebec", "Romeo", "Sierra", "Tango", "Uniform", "Victor", "Whiskey", "X-Ray", "Yankee", "Zulu"};
    private static final String[] OTHER_ABC = {"OREGON", "TEXAS", "NEW_YORK", "MONTANA", "WYOMING"};

    public static String[] init(int capacity) {
        String[] result = new String[capacity];
        Random rand = new Random();

        for(int i = 0; i < result.length; i++) {
            result[i] = MILLITARY_ALPHABET[rand.nextInt(25)];
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

    public static List getOnly(String[] array, Predicate<String> predicate) {
        List<String> result = new ArrayList<>();

        for (String n : array) {
            if(predicate.test(n)) {
                result.add(n);
            }
        }

        return result;
    }
}
