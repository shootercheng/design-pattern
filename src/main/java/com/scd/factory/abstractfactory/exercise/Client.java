package com.scd.factory.abstractfactory.exercise;

/**
 * @author chengdu
 * @date 2019/6/16.
 */
public class Client {

    public static void main(String[] args){
        ElectricalFactory electricalFactory = new TclElectricalFactory();
        electricalFactory.createTelevision().display();
        electricalFactory.createAirConditioner().display();
    }
}
