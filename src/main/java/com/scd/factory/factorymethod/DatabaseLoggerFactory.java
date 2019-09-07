package com.scd.factory.factorymethod;

/**
 * @author chengdu
 * @date 2019/6/16.
 */
public class DatabaseLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        return new DatabaseLogger();
    }
}
