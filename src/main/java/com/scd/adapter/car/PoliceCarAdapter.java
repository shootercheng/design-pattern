package com.scd.adapter.car;

/**
 * 对象适配器使用频率较高
 * @author chengdu
 * @date 2019/9/15.
 */
public class PoliceCarAdapter extends CarController {

    private PoliceSound policeSound;

    private PoliceLight policeLight;

    public PoliceCarAdapter(){
        this.policeSound = new PoliceSound();
        this.policeLight = new PoliceLight();
    }


    @Override
    public void sound() {
        policeSound.sound();
    }

    @Override
    public void light() {
        policeLight.light();
    }
}
