package com.scd.factory.simplefactory.exercise;

/**
 * @author chengdu
 */
public class Man implements Person{

    public Man(){
        System.out.println("create man");
    }

    @Override
    public void showType() {
        System.out.println("I am man");
    }
}
