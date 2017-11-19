package com.maksymenko.epam.external.practice.task1.ui;

import com.maksymenko.epam.external.practice.task1.compute.PerfectNumber;

import java.util.Scanner;

public class PerfectNumberFinder {
    public static void launchTask1_2(){
        Scanner in = new Scanner(System.in);

        System.out.println("-------Task 1.2-------");
        System.out.println("Please, enter end number");
        System.out.println("for search perfect numbers in range ");
        System.out.println("from 1 till end number");

        int endNumber = in.nextInt();

        System.out.println("Entered number: " + endNumber);
        System.out.print("Perfect numbers in that range: ");

        for(int i : PerfectNumber.findPerfect(endNumber)){
            if(i != 0){
                System.out.print(i + " ");
            }
        }
    }
}
