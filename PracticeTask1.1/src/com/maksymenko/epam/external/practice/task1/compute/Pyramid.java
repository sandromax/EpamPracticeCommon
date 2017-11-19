package com.maksymenko.epam.external.practice.task1.compute;

public class Pyramid {
    public static int[][] makePyramid(int floors){
        int[][] pyramid = new int[floors][floors*2-1];
        int widthValue = floors;
        int upperFloor = floors;

        for(int row = floors - 1; row >= 0; row--){
            for(int columnL = floors - 1, columnR = floors - 1; widthValue != 0;  columnL--, columnR++){
                pyramid[row][columnL] = widthValue;
                pyramid[row][columnR] = widthValue;
                widthValue--;
            }
            widthValue = --upperFloor;
        }

        return pyramid;
    }
}
