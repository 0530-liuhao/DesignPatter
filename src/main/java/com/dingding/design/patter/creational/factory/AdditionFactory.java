package com.dingding.design.patter.creational.factory;

import com.dingding.design.patter.creational.factory.impl.Addition;

public class AdditionFactory implements OperationFactory{
    @Override
    public Operation createOperation() {
        System.out.println("加法运算");
        return new Addition();
    }
}
