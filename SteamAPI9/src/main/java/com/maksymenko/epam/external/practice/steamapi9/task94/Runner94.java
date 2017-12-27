package com.maksymenko.epam.external.practice.steamapi9.task94;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.List;

public class Runner94 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "JavaScript", "Scala", "Kotlin", "Perl", "Fortran");
        System.out.println("started list: " + list);

        System.out.println("changed list: " + StringLambdaArray.allWordsToUpper(list, x -> x.toUpperCase()));

    }
}
