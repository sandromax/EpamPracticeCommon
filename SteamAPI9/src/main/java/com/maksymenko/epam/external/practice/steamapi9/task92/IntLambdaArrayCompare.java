package com.maksymenko.epam.external.practice.steamapi9.task92;

import java.util.Arrays;
import java.util.Random;

public class IntLambdaArrayCompare {
    public static Integer[] init(int capacity) {
        Random rand = new Random();

        Integer[] array = new Integer[capacity];
        for(int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(99);
        }

        return array;
    }

    public static void sort(Integer[] array) {
        Arrays.sort(array, (i1, i2) -> { return i2 - i1; });
    }

    public static void showArray(Integer[] array) {
        System.out.println(array);

        for(Integer i : array) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

}
