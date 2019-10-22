package com.dingding.design.patter.creational.easy.factory.impl;

import com.dingding.design.patter.creational.easy.factory.Shape;

/**
 * @Author liuhao
 * @Date 2019/10/22 11:12
 * @Description 正方形
 */
public class Square implements Shape {
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
