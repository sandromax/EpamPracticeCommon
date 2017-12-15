package com.maksymenko.epam.external.practice.threadtask83;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentHashMapWorker implements Runnable{
    private LongAdder timer = new LongAdder();
    ConcurrentHashMap<Integer, Integer> concurrentHashMap;
    Random random = new Random();

    public ConcurrentHashMapWorker(ConcurrentHashMap concurrentHashMap) {
        this.concurrentHashMap = concurrentHashMap;
    }

    @Override
    public void run() {
        long start = System.nanoTime();
        for(int i = 0; i < 10000; i++) {

            concurrentHashMap.put(random.nextInt(1000), random.nextInt(1000));
            System.out.println("putted to concHash");

        }

        for(Map.Entry<Integer, Integer> entry : concurrentHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        long finish = System.nanoTime();

        timer.add(finish - start);
    }

    public LongAdder getTimer() {
        return timer;
    }
}
