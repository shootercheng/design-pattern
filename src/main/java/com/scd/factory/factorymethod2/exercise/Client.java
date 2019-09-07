package com.scd.factory.factorymethod2.exercise;

/**
 * @author chengdu
 * @date 2019/6/16.
 */
public class Client {

    public static void main(String[] args){
        Car car = new BmCarFactory().createCar();
        System.out.println(car.carInfo());
    }
}
