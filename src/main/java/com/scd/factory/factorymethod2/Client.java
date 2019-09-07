package com.scd.factory.factorymethod2;

import com.scd.utils.XmlUtil;

/**
 * @author chengdu
 * @date 2019/6/16.
 */
public class Client {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String xmlPath = "E:\\Github\\designpattern\\src\\main\\java\\com\\scd\\factory\\factorymethod2\\factorytype2.xml";
        String type = XmlUtil.getCharType(xmlPath);
        Class clazz = Class.forName(type);
        LoggerFactory loggerFactory = (LoggerFactory) clazz.newInstance();
        loggerFactory.writeLog();
    }
}
