package com.maksymenko.epam.external.practice.steamapi9.task93;

import java.util.*;
import java.util.function.BooleanSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class IntLambdaArray {
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

    public static ArrayList getOnly(Integer[] array, Predicate<Integer> predicate) {
        ArrayList<Integer> result = new ArrayList<>();

        for (Integer n : array) {
            if(predicate.test(n)) {
                result.add(n);
            }
        }

        return result;

    }

    public static void showArray(Integer[] array) {
        System.out.println("array hashcode: " + array.hashCode());

        for(Integer i : array) {
            System.out.print(i + " ");
        }

        System.out.println("\n");
    }
}
