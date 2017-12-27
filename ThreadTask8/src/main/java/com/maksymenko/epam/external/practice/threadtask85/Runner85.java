package com.maksymenko.epam.external.practice.threadtask85;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

public class Runner85 {
    public static void main(String[] args) {
        System.out.println("\t\tTask 8.5\n");

        String pathString;
        String letter;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Enter path");
            pathString = input.next();

            System.out.println("Enter letter");
            letter = input.next();
        } while (!WordCounter.checkInput(pathString, letter));

        Path path = Paths.get(pathString);

        IFileWordsSearchResultRegistrator.clearFile();

        WordCounter wordCounter = new WordCounter(path, letter);

        ForkJoinPool pool = new ForkJoinPool();

        long start1 = System.currentTimeMillis();
        pool.invoke(wordCounter);
        long finish1 = System.currentTimeMillis();

        System.out.println("Sum by fork/join: " + wordCounter.join());
        System.out.println("Time wasted: " + (finish1-start1));

        System.out.println("RESULT:");

        for(String out : IFileWordsSearchResultRegistrator.read()) {
            System.out.println(out);
        }
    }

}
