package com.scd.factory.factorymethod2;

import com.scd.factory.factorymethod.Logger;

/**
 * @author chengdu
 * @date 2019/6/16.
 */
public abstract class LoggerFactory {

    public void writeLog(){
        Logger logger = createLogger();
        logger.writeLog();
    }

    public abstract Logger createLogger();
}
