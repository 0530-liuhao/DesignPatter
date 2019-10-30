package com.dingding.design.patter.creational.abstractfactory.color.impl;

import com.dingding.design.patter.creational.abstractfactory.color.Color;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
