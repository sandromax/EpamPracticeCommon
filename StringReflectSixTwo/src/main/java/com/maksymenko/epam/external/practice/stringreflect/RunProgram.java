package com.maksymenko.epam.external.practice.stringreflect;

public class RunProgram {
    public static void main(String[] args) {

        StringReflector stringReflector = new StringReflector();
        stringReflector.enterManualString();

        System.out.println("\t\tBefore reflect:");
        stringReflector.printStrings();

        stringReflector.changeStringByReflect();
        stringReflector.changeStringByReflectWithEnter();

        System.out.println("\t\tAfter reflect:");
        stringReflector.printStrings();


    }
}
