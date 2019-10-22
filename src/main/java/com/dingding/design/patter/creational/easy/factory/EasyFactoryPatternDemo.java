package com.dingding.design.patter.creational.easy.factory;

public class EasyFactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // 获取 Circle 的对象
        Shape circle = shapeFactory.getShaps("Circle");
        circle.draw();

        // 获取 Circle 的对象
        Shape rectangle = shapeFactory.getShaps("Rectangle");
        rectangle.draw();

        // 获取 Circle 的对象
        Shape square = shapeFactory.getShaps("Square");
        square.draw();

    }

}
