package com.scd.factory.factorymethod;

import com.scd.utils.XmlUtil;

/**
 * @author chengdu
 * @date 2019/6/16.
 */
public class Client {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
//        LoggerFactory loggerFactory = new FileLoggerFactory();
//        loggerFactory.createLogger().writeLog();

        // 读取xml 配置文件获取工厂
        String xmlPath = "E:\\Github\\designpattern\\src\\main\\java\\com\\scd\\factory\\factorymethod\\factorytype.xml";
        String className = XmlUtil.getCharType(xmlPath);
        Class clazz = Class.forName(className);
        Object object = clazz.newInstance();
        if(object instanceof LoggerFactory){
            LoggerFactory loggerFactory = (LoggerFactory) object;
            loggerFactory.createLogger().writeLog();
        }
    }
}
