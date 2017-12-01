package com.maksymenko.epam.external.practice.unaryarithmop;

import com.maksymenko.epam.external.practice.unaryarithmop.model.ReflectiveChanger;
import com.maksymenko.epam.external.practice.unaryarithmop.model.UnaryOperation;

import java.lang.reflect.InvocationTargetException;

public class Runner {
    public static void main(String[] args) {

        UnaryOperation uo1 = ReflectiveChanger.newInstance();
        UnaryOperation uo2 = ReflectiveChanger.newInstance();

        UnaryOperation uoP1 = ReflectiveChanger.newInstanceWithParam(34.56);
        UnaryOperation uoP2 = ReflectiveChanger.newInstanceWithParam(12.34);

        ReflectiveChanger.infoAboutInstance(uo1);
        ReflectiveChanger.infoAboutInstance(uo2);
        ReflectiveChanger.infoAboutInstance(uoP1);
        ReflectiveChanger.infoAboutInstance(uoP2);

        System.out.println("uo1\n"+ReflectiveChanger.infoAboutInstance(uo1));
        System.out.println("uo2\n"+ReflectiveChanger.infoAboutInstance(uo2));
        System.out.println("uoP1\n"+ReflectiveChanger.infoAboutInstance(uoP1));
        System.out.println("uoP1\n"+ReflectiveChanger.infoAboutInstance(uoP2));

        ReflectiveChanger.changeState(uo1,123.0);
        ReflectiveChanger.changeState(uo2, 234.0);
        ReflectiveChanger.changeState(uoP1, 345.0);
        ReflectiveChanger.changeState(uoP2, 456.0);

        System.out.println("\nStates was changed\n");

        System.out.println("uo1\n"+ReflectiveChanger.infoAboutInstance(uo1));
        System.out.println("uo2\n"+ReflectiveChanger.infoAboutInstance(uo2));
        System.out.println("uoP1\n"+ReflectiveChanger.infoAboutInstance(uoP1));
        System.out.println("uoP1\n"+ReflectiveChanger.infoAboutInstance(uoP2));

    }
}
