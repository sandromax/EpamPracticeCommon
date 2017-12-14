package com.maksymenko.epam.external.practice.threadtask82;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static java.lang.Thread.sleep;

public class Counter implements Runnable{
//    private int valueC;
    Variable variable;

    private Lock lock;
    private Condition printedVarCond;
    private Printer printer;

    public Counter() {

    }

    public Counter(Variable variable) {
        this.variable = variable;
    }

    public Counter(Variable var, Lock lock, Condition cond) {
        variable = var;
        this.lock = lock;
        this.printedVarCond = cond;
    }

//    @Override
//    public void run() {
//        for(int i = 0; i < 1000; i++) {
//            variable.increment();
//        }
//    }

    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {

            lock.lock();
            try
            {
                while (!variable.isPrinted())
                    printedVarCond.await();

                System.out.println(Thread.currentThread());

                variable.setValue(variable.getValue() + 1);
                variable.setPrinted(false);


                printedVarCond.signalAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }

}
