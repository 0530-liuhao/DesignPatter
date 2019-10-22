package com.dingding.design.patter.creational.easy.factory;

import com.dingding.design.patter.creational.easy.factory.impl.Circle;
import com.dingding.design.patter.creational.easy.factory.impl.Rectangle;
import com.dingding.design.patter.creational.easy.factory.impl.Square;

/**
 * @Author liuhao
 * @Date 2019/10/22 11:18
 * @Description Shape工厂
 */
public class ShapeFactory {

    public Shape getShaps(String shapeType){
        if(shapeType == null){
            return null;
        }else if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }else{
            return null;
        }
    }

}
