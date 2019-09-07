package com.scd.factory.factorymethod2.exercise3;

/**
 * @author chengdu
 * @date 2019/6/16.
 */
public class DbDataSource implements DataSource{
    @Override
    public String dataSourceINfo() {
        return "I am DbDataSource";
    }

    @Override
    public String convertDataSource() {
        return "convert DbDataSource to Xml";
    }
}
