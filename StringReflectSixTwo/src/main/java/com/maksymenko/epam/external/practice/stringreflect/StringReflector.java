package com.maksymenko.epam.external.practice.stringreflect;



import java.lang.reflect.Field;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StringReflector {

    String programString = "programString";
    String manualString = "";

    public StringReflector() {

    }

    public void enterManualString() {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("enter manualString");
            manualString = scanner.next();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }

    public void changeStringByReflect() {
        Class cl = programString.getClass();

        try {
            Field field = cl.getDeclaredField("value");
            char[] newStr = {'a', 's', 'd'};
            field.setAccessible(true);
            field.set(programString, newStr);
        } catch (NoSuchFieldException e) {
            System.out.println("NoSuchFieldException");
//            e.printStackTrace();
        } catch (IllegalAccessException e) {
//            e.printStackTrace();
            System.out.println("IllegalAccessException");
        }
    }

    public void changeStringByReflectWithEnter() {
        Class clM = manualString.getClass();

        System.out.println("enter new manualString");
        Scanner sc = new Scanner(System.in);
        String newString = sc.next();
        char[] charArray = newString.toCharArray();

        try {
            Field field = clM.getDeclaredField("value");
            field.setAccessible(true);
            field.set(manualString, charArray);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public void printStrings() {
        System.out.println("programString: " + programString + "\nmanualString: " + manualString);
    }


}
