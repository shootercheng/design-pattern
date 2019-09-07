package com.scd.factory.abstractfactory.exercise;

/**
 * @author chengdu
 * @date 2019/6/16.
 */
public class HaiErElectricalFactory implements ElectricalFactory {
    @Override
    public Television createTelevision() {
        return new HeTelevision();
    }

    @Override
    public AirConditioner createAirConditioner() {
        return new HeAirConditioner();
    }
}
