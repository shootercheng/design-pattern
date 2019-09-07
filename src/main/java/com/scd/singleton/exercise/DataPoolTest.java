package com.scd.singleton.exercise;

/**
 * @author chengdu
 */
public class DataPoolTest {

    public static void main(String[] args){
        DataPoolConn dataPoolConn = DataPoolConn.getDataPoolConnInstance(10);
        for(int i=0; i < 11; i++){
            System.out.println(dataPoolConn.borrowConn());
        }
    }
}
