package com.maksymenko.epam.external.practice.threadtask82;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Printer implements Runnable {
    //    public int valueP;
    private Variable variable;
    private Lock lock;
    private Condition printedVarCond;

    public Printer() {

    }

    public Printer(Variable variable) {
        this.variable = variable;
    }

    public Printer(Variable variable, Lock lock, Condition cond) {
        this.variable = variable;
        this.lock = lock;
        this.printedVarCond = cond;
    }

//    @Override
//    public void run() {
//        for(int i = 0; i <= 1000; i++) {
//            variable.print();
//        }
//    }

    @Override
    public void run() {
        for(int i = 0; i <= 1000; i++) {

            lock.lock();
            try {
                while (variable.isPrinted())
                    printedVarCond.await();
                System.out.println(Thread.currentThread());

                System.out.println(variable.getValue());

                variable.setPrinted(true);

                printedVarCond.signalAll();

            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }
}
