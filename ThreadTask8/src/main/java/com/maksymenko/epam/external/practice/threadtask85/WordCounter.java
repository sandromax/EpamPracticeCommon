package com.maksymenko.epam.external.practice.threadtask85;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.RecursiveTask;
import java.util.stream.Stream;

public class WordCounter extends RecursiveTask{
//    Path catalog;
    private File dir;
    private Path findCatalogWindows = Paths.get("D:\\find");

    public WordCounter() {

    }

    public WordCounter(String catalog) {
        this.dir = new File(catalog);
    }

    @Override
    protected Object compute() {
        try {
            Files.list(findCatalogWindows).forEach((s) -> {

            });
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new Object();
    }

    private int count(String path) {
        try {
            Stream str = Files.lines(Paths.get(path));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return 4;

    }

    private void some(Stream str) {
//        if(str.)
    }


}
