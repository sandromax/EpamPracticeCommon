package com.maksymenko.epam.external.practice.threadtask85;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class TestField85{
    public static void main(String[] args)  throws IOException {
//        String testString = " ++++.///.Cobra, cat---, window, pink, Parrot, silver, sun, cotTon, creed";
//        System.out.println(TestField85.countWords("C", testString));
        Path path = Paths.get("D:\\find\\test.txt");
        System.out.println("Is file D:\\find\\test.txt are exist:  " + Files.exists(path) + "\n");
        System.out.println(TestField85.handle(path, "aa"));


//        Path findCatalog = Paths.get("/home/san/find");

//        Path findCatalogWindows = Paths.get("D:\\find");
//        System.out.println("Is catalog D:\\find exist:  " + Files.exists(findCatalogWindows) + "\n");
//
//        //  .filter(x -> Files.isDirectory(x))
//        Files.list(findCatalogWindows).forEach(e ->
//                {
//                    if(e.toFile().isFile()) {
//
//                    }
//                }
//        );

//        File file = new File("D:\\find");
//        System.out.println(file);
//        System.out.println(file.isFile());
//        System.out.println(file.isDirectory());
//        System.out.println(file.getPath());
//        System.out.println(file.list().length);
//
//        File[] fa = file.listFiles();
//        System.out.println(fa.length);
//
//        for(File f : file.listFiles()) {
//            System.out.println(f.getName());
//        }





//          Testing streams
//        System.out.println(Files.exists(Paths.get("src/main/resources/30.txt")));
//        String contents = new String(Files.readAllBytes(Paths.get("src/main/resources/30.txt")), StandardCharsets.UTF_8);
//        List<String> words = Arrays.asList(contents.split("\\PL+"));
//
//        long count = 0;
//
//        long start = System.currentTimeMillis();
//        for(String w : words) {
//            if (w.length() > 12) count++;
//        }
//        long finish = System.currentTimeMillis();
//        System.out.println("       if count: " + count + " time " + (finish - start));
//
//
//        start = System.currentTimeMillis();
//        count = words.stream().filter(w -> w.length() > 12).count();
//        finish = System.currentTimeMillis();
//        System.out.println("         stream: " + count + " time " + (finish - start));
//
//        start = System.currentTimeMillis();
//        count = words.parallelStream().filter(w -> w.length() > 12).count();
//        finish = System.currentTimeMillis();
//        System.out.println("parallel stream: " + count + " time " + (finish - start));

    }

    public List<File> checkDir(Path dirPath) {
        List<File> filesList = new LinkedList<>();

        return filesList;
    }

    public static int handle(Path path, String letter) {
        if(letter.length() != 1) {
            System.out.println("More than one letter");
            return -1;
        }

        int count = 0;

        try {
            LinkedList<String> list = new LinkedList<>();
            Files.lines(path).forEach((e) -> list.add(e));

            for(String s : list) {
                count += TestField85.countWords(letter, s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return count;
    }

    public static int countWords(String letter, String string) {
        String regExpStart = "(\\b|\\p{Punct})([";
        String regExpMiddleLower = letter.toLowerCase();
        String regExpMiddleOr = "|";
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
