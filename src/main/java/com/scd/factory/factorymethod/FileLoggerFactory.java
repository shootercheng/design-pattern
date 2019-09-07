package com.scd.factory.factorymethod;

/**
 * @author chengdu
 * @date 2019/6/16.
 */
public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}
