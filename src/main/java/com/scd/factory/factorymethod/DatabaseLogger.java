package com.scd.factory.factorymethod;

/**
 * @author chengdu
 * @date 2019/6/16.
 */
public class DatabaseLogger implements Logger {

    @Override
    public void writeLog() {
        System.out.println("write database logger");
    }
}
