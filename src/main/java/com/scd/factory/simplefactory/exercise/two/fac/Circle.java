package com.scd.factory.simplefactory.exercise.two.fac;

/**
 * @author chengdu
 * @date 2019/6/12.
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("draw circle");
    }

    @Override
    public void erase() {
        System.out.println("erase circle");
    }
}
