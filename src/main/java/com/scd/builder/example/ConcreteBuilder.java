package com.scd.builder.example;

/**
 * @author chengdu
 * @date 2019/7/30.
 */
public class ConcreteBuilder extends Builder {
    @Override
    public void buildPartA() {
        getProduct().setPartA("Part A");
    }

    @Override
    public void buildPartB() {
        getProduct().setPartB("Part B");
    }

    @Override
    public void buildPartC() {
        getProduct().setPartC("Part C");
    }
}
