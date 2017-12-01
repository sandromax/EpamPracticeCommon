package com.maksymenko.epam.external.practice.unaryarithmop.model;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

/**
 *Class manipulates UnaryOperation class by reflection
 *
 * @version 1.01 2017-11-30
 * @author Maksymenko Oleksandr
 */
public class ReflectiveChanger {

    /**
     *Method creates an instance of UnaryOperation class through
     *          the reflection mechanism
     *
     * @return  UnaryOperation instance
     */
    public static UnaryOperation newInstance() {
        try {
            return UnaryOperation.class.getConstructor().newInstance();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     *Method creates an instance of UnaryOperation class through
     *          the reflection mechanism
     *
     * @param   number  Double value will be assigned to a single class field
     *
     * @return  UnaryOperation instance
     */
    public static UnaryOperation newInstanceWithParam(Double number) {
        try {
            return UnaryOperation.class.getConstructor(Double.class).newInstance(number);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Method generate string that contains hashcode and value of the received class field
     *
     * @param   uOInstance    instance of UnaryOperation class
     *
     * @return  string with info
     */
    public static String infoAboutInstance(UnaryOperation uOInstance) {
        try {
            Field field = uOInstance.getClass().getDeclaredField("number");
            field.setAccessible(true);
            Double fieldsValue = (Double) field.get(uOInstance);

            return  "Information about instance:\nhashcode: " + uOInstance.getClass().hashCode() + "\nfield \"number\": " + fieldsValue;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * Method changes object state through setter dynamic invocation
     *
     * @param uOInstance changeable instance
     *
     * @param newValue new value of the field
     */
    public static void changeState(UnaryOperation uOInstance, Double newValue) {
        try {
            uOInstance.getClass().getMethod("setNumber", Double.class).invoke(uOInstance, newValue);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
