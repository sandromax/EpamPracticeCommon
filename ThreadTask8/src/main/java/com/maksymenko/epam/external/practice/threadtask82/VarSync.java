package com.maksymenko.epam.external.practice.threadtask82;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class VarSync {
    private int value;
    private boolean isPrinted;

    Lock lock;
    Condition condition;

    public VarSync() {
        value = 0;
        isPrinted = false;
        lock = new ReentrantLock();
        condition = lock.newCondition();
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isPrinted() {
        return isPrinted;
    }

    public void setPrinted(boolean printed) {
        isPrinted = printed;
    }

    public synchronized void increment() {
        try
        {
            while(!isPrinted)
                wait();

            System.out.println(Thread.currentThread());

            value++;
            isPrinted = false;

            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void print() {
        try
        {
            while (isPrinted)
                wait();

            System.out.println(Thread.currentThread());

            System.out.println(value);
            isPrinted = true;

            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
