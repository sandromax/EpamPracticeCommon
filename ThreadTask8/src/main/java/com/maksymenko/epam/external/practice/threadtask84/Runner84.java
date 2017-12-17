package com.maksymenko.epam.external.practice.threadtask84;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

public class Runner84 {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,30,31,32,33};
        ArrayRecursiveCounter arc = new ArrayRecursiveCounter(array, 0, array.length);

        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(arc);

        System.out.println(arc.join());

    }
}
