package com.scd.builder.example;

/**
 * @author chengdu
 * @date 2019/7/30.
 */
public abstract class Builder {

    private Product product = new Product();

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buildPartC();

    public Product getProduct(){
        return product;
    }
}
