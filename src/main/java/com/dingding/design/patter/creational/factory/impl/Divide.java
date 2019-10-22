package com.dingding.design.patter.creational.factory.impl;

import com.dingding.design.patter.creational.factory.Operation;

public class Divide implements Operation {
    @Override
    public double getResult(double numberA, double numberB) throws Exception {
        if (numberB == 0) {
            throw new Exception("除数不能为0！");
        }
        return numberA/numberB;
    }
}
