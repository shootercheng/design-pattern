package com.scd.builder.example;

/**
 * @author chengdu
 * @date 2019/7/30.
 */
public class BuilderTest {

    public static void main(String[] args){
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        System.out.println(product);
    }
}
