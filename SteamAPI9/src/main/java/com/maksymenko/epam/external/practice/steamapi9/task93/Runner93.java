package com.maksymenko.epam.external.practice.steamapi9.task93;

import com.maksymenko.epam.external.practice.steamapi9.task92.StringLambdaArrayCompare;

public class Runner93 {
    public static void main(String[] args) {
        System.out.println("Int tasks");
        Integer[] intArray = IntLambdaArray.init(12);
        IntLambdaArray.showArray(intArray);

        IntLambdaArray.sort(intArray);
        IntLambdaArray.showArray(intArray);

        System.out.print("even only: ");
        System.out.println(IntLambdaArray.sortBy(intArray, (x) -> x%2 == 0));

        System.out.print("odd only: ");
        System.out.println(IntLambdaArray.sortBy(intArray, (x) -> x%2 != 0));

        System.out.print("more than 33: ");
        System.out.println(IntLambdaArray.sortBy(intArray, (x) -> x > 33));

        System.out.println("String tasks");

        String[] strings = StringLambdaArray.init(24);
        StringLambdaArray.show(strings);

        StringLambdaArray.sort(strings);
        StringLambdaArray.show(strings);

        System.out.print("\nStrings begin from 'O': ");
        System.out.println(StringLambdaArray.sortBy(strings, x -> x.charAt(0) == 'O'));

        System.out.print("\nlength more than 5 characters: ");
        System.out.println(StringLambdaArray.sortBy(strings, x -> x.length() > 5));

        System.out.print("\nlength less than 5 letters: ");
        System.out.println(StringLambdaArray.sortBy(strings, x -> x.length() < 5));

    }

}
