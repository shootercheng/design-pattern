package com.scd.factory.factorymethod2.exercise3;

import com.scd.utils.XmlUtil;

/**
 * @author chengdu
 * @date 2019/6/16.
 */
public class Client {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String xmlPath = "E:\\Github\\designpattern\\src\\main\\java\\com\\scd\\factory\\factorymethod2\\exercise3\\datasourcetype.xml";
        String type = XmlUtil.getCharType(xmlPath);
        Class<?> dataSourceFactoryClass = Class.forName(type);
        DataSourceFactory dataSourceFactory = (DataSourceFactory) dataSourceFactoryClass.newInstance();
        DataSource dbDataSource = dataSourceFactory.createDataSource();
        String res = dbDataSource.convertDataSource();
        System.out.println(res);
    }
}
