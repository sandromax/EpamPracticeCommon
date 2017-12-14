package com.maksymenko.epam.external.practice.threadtask82;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Runner82 {
    public static void main(String[] args) {

        Variable variable = new Variable();
        Lock lock = new ReentrantLock();
        Condition cond = lock.newCondition();

//        Thread printThread = new Thread(new Printer(variable));
//        Thread countThread = new Thread(new Counter(variable));

        Thread printThread = new Thread(new Printer(variable, lock, cond));
        Thread countThread = new Thread(new Counter(variable, lock, cond));

        printThread.start();
        countThread.start();

        try{
            printThread.join();
            countThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
