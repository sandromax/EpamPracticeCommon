package com.maksymenko.epam.external.practice.threadtask83;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Runner83 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        ConcurrentHashMap<Integer, Integer> concHashMap = new ConcurrentHashMap<>();

        HashMapWorker hashMapWorker = new HashMapWorker(hashMap);
        ConcurrentHashMapWorker concurrentHashMapWorker = new ConcurrentHashMapWorker(concHashMap);

        Thread threadHash = new Thread(hashMapWorker);
        Thread threadConcHash = new Thread(concurrentHashMapWorker);

        threadHash.start();
        threadConcHash.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("hash timer: " + hashMapWorker.getTimer() + "ns");
        System.out.println("concHash timer: " + concurrentHashMapWorker.getTimer() + "ns");
    }


}
