package com.scd.factory.factorymethod2.exercise3;

/**
 * @author chengdu
 * @date 2019/6/16.
 */
public class TxtDataSource implements DataSource{
    @Override
    public String dataSourceINfo() {
        return "I am TxtDataSource";
    }

    @Override
    public String convertDataSource() {
        return "convert TxtDataSource to Xml";
    }
}
