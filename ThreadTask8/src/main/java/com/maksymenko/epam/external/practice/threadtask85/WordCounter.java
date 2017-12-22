package com.maksymenko.epam.external.practice.threadtask85;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.concurrent.RecursiveTask;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordCounter extends RecursiveTask{
//    Path catalog;
    private File dir;
//    private Path findCatalogWindows = Paths.get("D:\\find");
    private Path path;
    private String letter;
    private int count;

    public WordCounter() {
        path = Paths.get("C:\\");
        letter = "";
        count = 0;
    }

    public WordCounter(Path path, String letter) {
        this.path = path;
        this.letter = letter;
        count = 0;
    }

    @Override
    protected Integer compute() {
        try {
            LinkedList<Path> curCatalog = Files.list(path).collect(Collectors.toCollection(LinkedList::new));

            for(Path cyclePath : curCatalog) {
                if(cyclePath.toFile().isFile()) {
                    count += TestField85.handle(cyclePath, letter);
                } else {
                    if(cyclePath.toFile().isDirectory()) {
                        WordCounter wc = new WordCounter(cyclePath, letter);
                        System.out.println("fork");
                        invokeAll(wc);
                        count += (Integer)wc.join();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return count;
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
