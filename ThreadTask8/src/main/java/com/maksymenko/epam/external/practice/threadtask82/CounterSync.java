package com.maksymenko.epam.external.practice.threadtask82;

public class CounterSync implements Runnable{

    VarSync varSync;

    public CounterSync(VarSync varSync) {
        this.varSync = varSync;
    }

    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            varSync.increment();
        }
    }
}
