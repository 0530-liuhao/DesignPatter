package com.dingding.design.patter.creational.abstractfactory;

import com.dingding.design.patter.creational.abstractfactory.color.Color;
import com.dingding.design.patter.creational.abstractfactory.color.impl.Green;
import com.dingding.design.patter.creational.abstractfactory.color.impl.Red;
import com.dingding.design.patter.creational.abstractfactory.shape.Shape;

public class ColorFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }else if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
