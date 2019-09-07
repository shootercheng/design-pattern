package com.scd.factory.simplefactory.exercise;

/**
 * @author chengdu
 * @date 2019/6/12.
 */
public class Woman implements Person{

    public Woman(){
        System.out.println("create woman");
    }

    @Override
    public void showType() {
        System.out.println("I am woman");
    }
}
