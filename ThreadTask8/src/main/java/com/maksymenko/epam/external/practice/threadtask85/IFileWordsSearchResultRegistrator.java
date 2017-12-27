package com.maksymenko.epam.external.practice.threadtask85;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public interface IFileWordsSearchResultRegistrator {
    String WHICH_TO_WRITE = "found.txt";

    static void clearFile() {
        File file = new File(WHICH_TO_WRITE);
        if(file.exists()) {
            file.delete();
        }
    }

    static boolean write(String fileName, int foundWords) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(WHICH_TO_WRITE, true))) {
            bw.write(fileName.concat(" " + foundWords));
            bw.flush();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    static List<String> read() {
        try {
            return Files.readAllLines(Paths.get(WHICH_TO_WRITE)).stream().collect(Collectors.toCollection(LinkedList::new));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
