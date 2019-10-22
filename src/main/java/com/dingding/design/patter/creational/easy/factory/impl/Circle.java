package com.dingding.design.patter.creational.easy.factory.impl;

import com.dingding.design.patter.creational.easy.factory.Shape;

/**
 * @Author liuhao
 * @Date 2019/10/22 11:11
 * @Description 圆形
 */
public class Circle implements Shape {
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
