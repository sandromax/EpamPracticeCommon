package com.maksymenko.epam.external.practice.threadtask84;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

public class Runner84 {
    public static void main(String[] args) {
        System.out.println("\t\tTask 8.4\n");

        int[] ar = ArrayRecursiveCounter.init(1_000_000);

        ArrayRecursiveCounter arc = new ArrayRecursiveCounter(ar,0, 1_000_000);

        ForkJoinPool pool = new ForkJoinPool();

        long start1 = System.currentTimeMillis();
        pool.invoke(arc);
        long finish1 = System.currentTimeMillis();

        System.out.println("Sum by fork/join: " + arc.join());
        System.out.println("Time wasted: " + (finish1-start1));

        int[] arCheck = arc.getArray();
        long start = System.currentTimeMillis();
        int res = 0;
        for(int i : arCheck) {
            res += i;
        }
        System.out.println("\nSum by foreach:   " + res);
        long finish = System.currentTimeMillis();
        System.out.println("Time wasted: " + (finish-start));

    }
}
