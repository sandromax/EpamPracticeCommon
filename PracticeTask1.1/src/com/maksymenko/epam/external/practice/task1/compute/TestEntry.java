package com.maksymenko.epam.external.practice.task1.compute;

public class TestEntry {

    public static boolean isPositive(int number){
        if(number < 0){
            return false;
        } else {
            return true;
        }
    }

    public static Boolean isInteger(double number){
        int buffer = (int)number;
        System.out.println(buffer);
        if(number - buffer == 0){
            return true;
        } else {
            return  false;
        }
    }

}
