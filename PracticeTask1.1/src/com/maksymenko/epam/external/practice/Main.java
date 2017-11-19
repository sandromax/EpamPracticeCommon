package com.maksymenko.epam.external.practice;

import com.maksymenko.epam.external.practice.task1.compute.Matrix;
import com.maksymenko.epam.external.practice.task1.ui.Interactive;
import com.maksymenko.epam.external.practice.task1.ui.MatrixManipulator;
import com.maksymenko.epam.external.practice.task1.ui.PerfectNumberFinder;
import com.maksymenko.epam.external.practice.task1.ui.PyramidBuilder;
import com.maksymenko.epam.external.practice.task2.ui.MenuTask2;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //---Task-1.1---
//        Interactive interactive = new Interactive();
//        interactive.launchTranslator();

        //---Task-1.2---
//        PerfectNumberFinder.launchTask1_2();

        //---Task-1.3---
//        PyramidBuilder.makePyramid();

        //---Task-1.4---
//        Matrix.showMatrix(Matrix.createNotEmpty(5));
        MatrixManipulator.launch();

        //*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*//
        //---Task-2---
//        MenuTask2 menuTask2 = new MenuTask2();
//        menuTask2.launch();

    }
}
