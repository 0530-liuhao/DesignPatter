package com.dingding.design.patter.creational.abstractfactory.color.impl;

import com.dingding.design.patter.creational.abstractfactory.color.Color;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
