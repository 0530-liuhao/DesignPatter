package com.dingding.design.patter.creational.abstractfactory;

import com.dingding.design.patter.creational.abstractfactory.color.Color;
import com.dingding.design.patter.creational.abstractfactory.shape.Shape;

public abstract class AbstractFactory {

    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);

}
