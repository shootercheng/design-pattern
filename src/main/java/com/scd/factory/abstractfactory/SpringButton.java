package com.scd.factory.abstractfactory;

/**
 * @author chengdu
 * @date 2019/6/16.
 */
public class SpringButton implements Button {
    @Override
    public void display() {
        System.out.println("display spring button");
    }
}
