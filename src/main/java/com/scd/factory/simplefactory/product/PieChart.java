package com.scd.factory.simplefactory.product;

/**
 * @author chengdu
 * @date 2019/6/12.
 */
public class PieChart implements Chart {

    public PieChart(){
        System.out.println("create pie chart");
    }

    @Override
    public void display() {
        System.out.println("show pie chart");
    }
}
