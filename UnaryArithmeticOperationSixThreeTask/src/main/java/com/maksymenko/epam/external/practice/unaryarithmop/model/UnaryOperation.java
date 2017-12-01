/*
 *This is experimental class for honing skills in reflection
 * it has one field and several methods
 * @version 1.01 2017-11-30
 * @author Maksymenko Oleksandr
 */

package com.maksymenko.epam.external.practice.unaryarithmop.model;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UnaryOperation {
    private Double number;

    public UnaryOperation() {
        number = 0.0;
    }

    public UnaryOperation(Double newNumber) {
        number = newNumber;
    }

    public Double getNumber() {
        return number;
    }

    public void setNumber(Double number) {
        this.number = number;
    }

    public String toString() {
        return number.toString();
    }

    public Double increment(Double number) {
        return number + 1;
    }

    public Double decrement(Double number) {
        return number - 1;
    }

}
