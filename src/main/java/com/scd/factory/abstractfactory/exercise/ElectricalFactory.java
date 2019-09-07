package com.scd.factory.abstractfactory.exercise;

/**
 * @author chengdu
 * @date 2019/6/16.
 */
public interface ElectricalFactory {
    Television createTelevision();

    AirConditioner createAirConditioner();
}
