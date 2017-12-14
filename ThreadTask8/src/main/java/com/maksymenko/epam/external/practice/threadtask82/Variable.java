package com.maksymenko.epam.external.practice.threadtask82;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Variable {
    private int value;
    private boolean isPrinted;

    Lock lock;
    Condition condition;

    public Variable() {
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

    public void increment() {
        lock.lock();
        try
        {
            while(!isPrinted)
                condition.await();

            System.out.println(Thread.currentThread());

            value++;
            isPrinted = false;

            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }

    public void print() {
        lock.lock();
        try
        {
            while (isPrinted)
                condition.await();

            System.out.println(Thread.currentThread());

            System.out.println(value);
            isPrinted = true;

            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }
}
