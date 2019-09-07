package com.scd.factory.simplefactory.exercise.two.fac;

/**
 * @author chengdu
 * @date 2019/6/12.
 */
public class Triangle implements Shape{
    @Override
    public void draw() {
        System.out.println("draw Triangle");
    }

    @Override
    public void erase() {
        System.out.println("erase Triangle");
    }
}
