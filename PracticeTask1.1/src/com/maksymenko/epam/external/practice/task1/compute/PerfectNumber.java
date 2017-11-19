package com.maksymenko.epam.external.practice.task1.compute;

/**
 *
 */
public class PerfectNumber {

    public static int[] getDivisors(int number){
        int[] result = new int[10000];
        int resultArrayIterator = 0;
        int divisorQuantity = 0;

        for(int divisor = 1; divisor < number; divisor++){
            if(number%divisor == 0){
                result[resultArrayIterator] = divisor;
                resultArrayIterator++;
                divisorQuantity++;
            }
        }

        return NumberSystemTranslator.cutAndRotateArray(result, divisorQuantity);
    }

    public static int getArraySum(int[] innerArray){
        int sum = 0;

        for(int i = 0; i < innerArray.length; i++){
            sum += innerArray[i];
        }

        return sum;
    }

    public static Boolean isPerfectNumber(int testNumber){
        if(testNumber == getArraySum(getDivisors(testNumber))){
            return true;
        } else {
            return false;
        }
    }

    public static int[] findPerfect(int endNumber){
        int[] resultArray = new int [31];
        int resultArrayIterator = 0;

        for(int i = 0; i <= endNumber; i++){
            if(isPerfectNumber(i)){
                resultArray[resultArrayIterator] = i;
                resultArrayIterator++;
            }
        }

        return resultArray;
    }

}
