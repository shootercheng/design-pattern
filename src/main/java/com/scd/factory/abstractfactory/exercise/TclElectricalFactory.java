package com.scd.factory.abstractfactory.exercise;

/**
 * @author chengdu
 * @date 2019/6/16.
 */
public class TclElectricalFactory implements ElectricalFactory {
    @Override
    public Television createTelevision() {
        return new TclTelevision();
    }

    @Override
    public AirConditioner createAirConditioner() {
        return new TclAirConditioner();
    }
}
