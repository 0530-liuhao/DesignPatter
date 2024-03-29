package com.dingding.design.patter.creational.abstractfactory;

import com.dingding.design.patter.creational.abstractfactory.color.Color;
import com.dingding.design.patter.creational.abstractfactory.shape.Shape;
import com.dingding.design.patter.creational.abstractfactory.shape.impl.Rectangle;
import com.dingding.design.patter.creational.abstractfactory.shape.impl.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
