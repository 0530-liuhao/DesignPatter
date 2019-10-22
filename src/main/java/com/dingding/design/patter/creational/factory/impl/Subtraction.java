package com.dingding.design.patter.creational.factory.impl;

import com.dingding.design.patter.creational.factory.Operation;

public class Subtraction implements Operation {
    @Override
    public double getResult(double numberA, double numberB) throws Exception {
        return numberA - numberB;
    }
}
