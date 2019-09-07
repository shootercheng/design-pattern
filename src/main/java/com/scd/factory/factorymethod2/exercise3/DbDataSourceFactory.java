package com.scd.factory.factorymethod2.exercise3;

/**
 * @author chengdu
 * @date 2019/6/16.
 */
public class DbDataSourceFactory implements DataSourceFactory{

    @Override
    public DataSource createDataSource() {
        return new DbDataSource();
    }

}
