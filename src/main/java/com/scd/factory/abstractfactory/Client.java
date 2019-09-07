package com.scd.factory.abstractfactory;

import com.scd.utils.XmlUtil;

/**
 * @author chengdu
 * @date 2019/6/16.
 */
public class Client {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String xmlPath = "E:\\Github\\designpattern\\src\\main\\java\\com\\scd\\factory\\abstractfactory\\factorytype.xml";
        String type = XmlUtil.getCharType(xmlPath);
        Class<?> clazz = Class.forName(type);
        SkinFactory skinFactory = (SkinFactory) clazz.newInstance();
        skinFactory.createButton().display();
        skinFactory.createTextField().display();
        skinFactory.createComboBox().display();
    }
}
