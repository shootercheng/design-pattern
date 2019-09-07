package com.scd.factory.factorymethod2;

import com.scd.factory.factorymethod.DatabaseLogger;
import com.scd.factory.factorymethod.Logger;

/**
 * @author chengdu
 * @date 2019/6/16.
 */
public class DataBaseFactory extends LoggerFactory{
    @Override
    public Logger createLogger() {
        return new DatabaseLogger();
    }
}
