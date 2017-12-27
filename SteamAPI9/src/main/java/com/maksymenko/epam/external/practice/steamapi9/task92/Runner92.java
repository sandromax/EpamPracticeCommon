package com.maksymenko.epam.external.practice.steamapi9.task92;

import static com.maksymenko.epam.external.practice.steamapi9.task92.IntLambdaArrayCompare.showArray;

public class Runner92 {
    public static void main(String[] args) {

        String[] strings = StringLambdaArrayCompare.init(12);
        StringLambdaArrayCompare.show(strings);

        StringLambdaArrayCompare.sort(strings);
        StringLambdaArrayCompare.show(strings);


        Integer[] intArray = IntLambdaArrayCompare.init(12);
        showArray(intArray);

        IntLambdaArrayCompare.sort(intArray);
        showArray(intArray);

    }


}
