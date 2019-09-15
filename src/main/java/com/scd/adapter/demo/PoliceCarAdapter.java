package com.scd.adapter.demo;

/**
 * 类适配器模式
 * @author chengdu
 * @date 2019/9/15.
 */
public class PoliceCarAdapter extends PolicaCarAdapteree implements CarController {
    @Override
    public void move() {
        super.policeCarMove();
    }

    @Override
    public void sound() {
        super.policaCarSound();
    }

    @Override
    public void light() {
        super.policaCarlight();
    }
}
