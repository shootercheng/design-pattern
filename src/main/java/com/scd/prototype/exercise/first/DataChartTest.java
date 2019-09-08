package com.scd.prototype.exercise.first;

/**
 * @author chengdu
 * @date 2019/9/8.
 */
public class DataChartTest {

    public static void main(String[] args){
        DataSet dataSet = new DataSet("red", "abcscd");
        DataChart dataChart = new DataChart("1", dataSet);
        DataChart dataChart_clone = dataChart.deepClone();
        System.out.println(dataChart == dataChart_clone);
        dataChart_clone.setNo("2");
        System.out.println(dataChart_clone);
    }
}
