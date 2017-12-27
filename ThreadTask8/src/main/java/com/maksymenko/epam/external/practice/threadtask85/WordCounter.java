package com.maksymenko.epam.external.practice.threadtask85;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.concurrent.RecursiveTask;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static com.maksymenko.epam.external.practice.threadtask85.IFileWordsSearchResultRegistrator.WHICH_TO_WRITE;

public class WordCounter extends RecursiveTask{
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
                    count += handleFile(cyclePath, letter);
                } else {
                    if(cyclePath.toFile().isDirectory()) {
                        WordCounter wc = new WordCounter(cyclePath, letter);
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

    public static boolean checkInput(String pathString, String letter) {
        Path path = Paths.get(pathString);

        if(!path.toFile().exists()) {
            System.out.println("Error! Path: " + path + " invalid!");
            return false;
        } else if(letter.length() != 1) {
            System.out.println("Error! Letter must have on character.");
            return false;
        } else
            return true;
    }

    private static int handleFile(Path path, String letter) {
        int count = 0;
        int control;

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(WHICH_TO_WRITE, true))){
            LinkedList<String> list = new LinkedList<>();
            Files.lines(path).forEach((e) -> list.add(e));

            control = count;

            for(String s : list) {
                count += countWordsInFile(letter, s);
            }

            if(control < count) {
                bw.write("in file " + path.getFileName().toString() + " found " + count + " words\n");
                bw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return count;
    }

    private static int countWordsInFile(String letter, String string) {
        String regExpStart = "(\\b|\\p{Punct})([";
        String regExpMiddleLower = letter.toLowerCase();
        String regExpMiddleUpper = letter.toUpperCase();
        String regExpEnd = "][A-Za-z]*)(\\b|\\p{Punct})";

        String regexp = regExpStart.concat(regExpMiddleLower).concat(regExpMiddleUpper).concat(regExpEnd);

        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(string);

        int result = 0;

        while(matcher.find())
            result++;

        return result;
    }


}
