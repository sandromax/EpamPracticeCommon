package com.maksymenko.epam.external.practice.threadtask85;

import java.nio.file.Path;
import java.util.concurrent.RecursiveTask;

public class WordCounter extends RecursiveTask{
    Path catalog;

    public WordCounter() {

    }

    public WordCounter(Path catalog) {
        this.catalog = catalog;
    }

    @Override
    protected Object compute() {
        return null;
    }
}
