package com.scd.adapter.car;

/**
 * @author chengdu
 * @date 2019/9/15.
 */
public abstract class CarController {

    public void move(){
        System.out.println("小车移动");
    }

    public abstract void sound();

    public abstract void light();
}
