package com.maksymenko.epam.external.practice.task1.compute;

public class NumberSystemTranslator {

    public static int[] toBinary(int number){
        int[] bufferArray = new int[31];
        int bitCapacity = 0;
        int iterator = 0;

        do{
            if(number%2 == 1){
                bufferArray[iterator] = 1;
                bitCapacity++;
                iterator++;
                number -= 1;
            } else if(number%2 == 0){
                bufferArray[iterator] = 0;
                bitCapacity++;
                iterator++;
            }
            number /= 2;
        }while(number != 0 && number != 1);
        bufferArray[iterator] = number;
        bitCapacity++;

        return cutAndRotateArray(bufferArray, bitCapacity);
    }

    public static int[] toOctal(int number){
        int[] bufferArray = new int[31];
        int bitCapacity = 0;
        int iterator = 0;

        do{
            if(number%8 == 0){
                bufferArray[iterator] = 0;
                bitCapacity++;
                iterator++;
                number /= 8;
            } else if(number%8 != 0){
                bufferArray[iterator] = number%8;
                bitCapacity++;
                iterator++;
                number /= 8;
            }
        }while(number > 7);
        bufferArray[iterator] = number;
        bitCapacity++;

        return cutAndRotateArray(bufferArray, bitCapacity);
    }

    public static int[] toHex(int number){
        int[] bufferArray = new int[31];
        int bitCapacity = 0;
        int iterator = 0;

        do{
            if(number%16 == 0){
                bufferArray[iterator] = 0;
                bitCapacity++;
                iterator++;
                number /= 16;
            } else if(number%16 != 0){
                bufferArray[iterator] = number%16;
                bitCapacity++;
                iterator++;
                number /= 16;
            }
        }while(number > 15);
        bufferArray[iterator] = number;
        bitCapacity++;

        return cutAndRotateArray(bufferArray, bitCapacity);
    }

    public static int[] cutAndRotateArray(int[] innerArray, int newLength){
        int[] outerArray = new int[newLength];
        for(int i = newLength - 1, j = 0; i >= 0; i--, j++){
            outerArray[j] = innerArray[i];
        }
        return outerArray;
    }
}
