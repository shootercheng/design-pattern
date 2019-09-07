package com.scd.factory.simplefactory.product;

/**
 * @author chengdu
 * @date 2019/6/12.
 */
public class HistogramChart implements Chart {

    public HistogramChart(){
        System.out.println("create histogram chart");
    }

    @Override
    public void display() {
        System.out.println("show histogram chart");
    }
}
