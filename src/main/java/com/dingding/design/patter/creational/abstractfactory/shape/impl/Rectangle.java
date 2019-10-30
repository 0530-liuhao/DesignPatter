package com.dingding.design.patter.creational.abstractfactory.shape.impl;

import com.dingding.design.patter.creational.abstractfactory.shape.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
