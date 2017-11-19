package com.maksymenko.epam.external.practice.task1.ui;

import com.maksymenko.epam.external.practice.task1.compute.Matrix;

import java.util.Scanner;

public class MatrixManipulator {
    public static void launch(){
        System.out.println("I want to know matrix capacity");
        Scanner in = new Scanner(System.in);
        int capacity = in.nextInt();

        int[][] matrix = Matrix.createNotEmpty(capacity);

        System.out.println("What we have");
        Matrix.showMatrix(matrix);

        System.out.println("Attention! Matrix rotating");
        Matrix.showMatrix(Matrix.minusNintyDegrees(matrix));


    }
}
