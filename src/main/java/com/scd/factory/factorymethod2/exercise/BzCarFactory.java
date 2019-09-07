package com.scd.factory.factorymethod2.exercise;

/**
 * @author chengdu
 * @date 2019/6/16.
 */
public class BzCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new BzCar();
    }
}
