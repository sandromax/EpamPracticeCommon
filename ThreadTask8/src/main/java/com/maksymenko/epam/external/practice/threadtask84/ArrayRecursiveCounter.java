package com.maksymenko.epam.external.practice.threadtask84;

import java.util.Random;
import java.util.concurrent.RecursiveTask;

public class ArrayRecursiveCounter extends RecursiveTask<Integer>{
    private int[] array;
//    private int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,30,31,32,33};
    private int from;
    private int to;

    public ArrayRecursiveCounter(int[] array, int from, int to) {
        this.array = array;
        this.from = from;
        this.to = to;
    }

    public static int[] init(int capacity) {
        Random random = new Random();
        int[] result = new int[capacity];

        for(int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(100);
        }

        return result;
    }

    @Override
    protected Integer compute() {
        if(to - from < 20) {
            int count = 0;

            for(int i = from; i < to; i++) {
                count += array[i];
            }

            return count;
        }
        else {
            int middle = (from + to) / 2;
            ArrayRecursiveCounter first = new ArrayRecursiveCounter(array, from, middle);
            ArrayRecursiveCounter second = new ArrayRecursiveCounter(array, middle, to);
            invokeAll(first, second);
            return first.join() + second.join();
        }
    }

    public int[] getArray() {
        return array;
    }
}
