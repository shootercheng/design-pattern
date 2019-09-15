package com.scd.adapter.demo;

/**
 * @author chengdu
 * @date 2019/9/15.
 */
public class Client {

    public static void main(String[] args){
        CarController carController = new PoliceCarAdapter();
        carController.move();
        carController.sound();
        carController.light();
    }
}
