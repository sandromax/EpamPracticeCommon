package com.maksymenko.epam.external.practice.task1.ui;

import java.util.Scanner;
import com.maksymenko.epam.external.practice.task1.compute.*;

public class Interactive {

    private double innerNumber;
    private int userNumber;

    public void launchTranslator(){
        hello();
        if(testing()){
            getResults();
        }
    }

    private void hello(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter decimal number");
        innerNumber = in.nextDouble();
        System.out.println("Entered number: " + innerNumber);
    }

    private Boolean testing(){
        if(TestEntry.isInteger(innerNumber) & TestEntry.isPositive((int) innerNumber)){
            userNumber = (int)innerNumber;
            return true;
        } else {
            System.out.println("Entered number wasn't integer or wasn't positive");
            return false;
        }
    }

    private void getResults(){
        int[] binary = NumberSystemTranslator.toBinary(userNumber);
        System.out.print(userNumber + " in binary is: ");
        for(int bit : binary){
            System.out.print(bit);
        }
        System.out.println();

        int[] octal = NumberSystemTranslator.toOctal(userNumber);
        System.out.print(userNumber + " in octal is: ");
        for(int bit : octal){
            System.out.print(bit);
        }
        System.out.println();

        int[] hex = NumberSystemTranslator.toHex(userNumber);
        System.out.print(userNumber + " in hex is: ");
        for(int bit : hex){
            if(bit < 10){
                System.out.print(bit);
            } else if(bit == 10){
                System.out.print('\u0041');
            } else if(bit == 11){
                System.out.print('\u0042');
            }else if(bit == 12){
                System.out.print('\u0043');
            }else if(bit == 13){
                System.out.print('\u0044');
            }else if(bit == 14){
                System.out.print('\u0045');
            }else if(bit == 15){
                System.out.print('\u0046');
            }

        }
        System.out.println();
    }



}
