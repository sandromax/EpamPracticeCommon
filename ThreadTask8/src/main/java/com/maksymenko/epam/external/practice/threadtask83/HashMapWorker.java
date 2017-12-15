package com.maksymenko.epam.external.practice.threadtask83;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.LongAdder;

public class HashMapWorker implements Runnable{
    private LongAdder timer = new LongAdder();
    HashMap<Integer, Integer> hashMap;
    Random random = new Random();

    public HashMapWorker(HashMap<Integer, Integer> hashMap) {
        this.hashMap = hashMap;
    }

    @Override
    public synchronized void run() {
        long start = System.nanoTime();
        for(int i = 0; i < 10000; i++) {

            hashMap.put(random.nextInt(), random.nextInt());
            System.out.println("putted to hash");
        }


        for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        long finish = System.nanoTime();

        timer.add(finish - start);
    }

    public LongAdder getTimer() {
        return timer;
    }
}
