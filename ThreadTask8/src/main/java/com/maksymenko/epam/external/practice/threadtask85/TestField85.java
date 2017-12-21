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

public class TestField85{
    public static void main(String[] args)  throws IOException {

        Path findCatalog = Paths.get("/home/san/find");
        System.out.println("Catalog \"/home/san/find\" exist:  " + Files.exists(findCatalog) + "\n");

        Files.list(findCatalog).filter(x -> Files.isDirectory(x)).forEach(e ->
                {
                    System.out.println(e);
                }
        );

        File file = new File("/home/san/find");
        System.out.println(file);
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.getPath());
        System.out.println(file.list().length);

        File[] fa = file.listFiles();
        System.out.println(fa.length);

        for(File f : file.listFiles()) {
            System.out.println(f.getName());
        }





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
}
