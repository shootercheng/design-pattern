package com.scd.factory.simplefactory.product;

/**
 * @author chengdu
 * @date 2019/6/12.
 */
public class LineChart implements Chart {

    public LineChart(){
        System.out.println("create line chart");
    }

    @Override
    public void display() {
        System.out.println("show line chart");
    }
}
