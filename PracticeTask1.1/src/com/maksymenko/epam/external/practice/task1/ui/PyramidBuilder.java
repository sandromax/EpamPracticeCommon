package com.maksymenko.epam.external.practice.task1.ui;

import com.maksymenko.epam.external.practice.task1.compute.Pyramid;

import java.util.Scanner;

public class PyramidBuilder {
    public static void makePyramid(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter integer number from 1 till 9");
        System.out.println("and enjoy beautiful digital pyramid");

        int floors;

        do{
            floors = in.nextInt();

            if(floors > 9 || floors < 1){
                System.out.println("My teacher does not allow me make so big pyramid");
            } else{
                showPyramid(Pyramid.makePyramid(floors));
                System.out.println("What a beautiful pyramid");
            }

            System.out.println("More?\n(print \"17\" to exit)");
        }while(floors != 17);
    }

    public static void showPyramid(int[][] pyramid){
        for(int i = 0; i < pyramid.length; i++){
            for(int j = 0; j < pyramid[i].length; j++){
                if(pyramid[i][j] == 0){
                    System.out.print(" ");
                } else{
                    System.out.print(pyramid[i][j]);
                }
            }
            System.out.println();
        }

    }
}
