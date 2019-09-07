package com.scd.factory.factorymethod2;

import com.scd.factory.factorymethod.FileLogger;
import com.scd.factory.factorymethod.Logger;

/**
 * @author chengdu
 * @date 2019/6/16.
 */
public class FileLoggerFactory extends LoggerFactory {
    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}
