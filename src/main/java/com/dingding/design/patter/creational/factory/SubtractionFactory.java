package com.dingding.design.patter.creational.factory;

import com.dingding.design.patter.creational.factory.impl.Subtraction;

public class SubtractionFactory implements OperationFactory{
    @Override
    public Operation createOperation() {

        System.out.println("减法运算");
        return new Subtraction();

    }
}
