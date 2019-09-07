package com.scd.factory.simplefactory.fac;

import com.scd.factory.simplefactory.product.Chart;
import com.scd.factory.simplefactory.product.HistogramChart;
import com.scd.factory.simplefactory.product.LineChart;
import com.scd.factory.simplefactory.product.PieChart;
import com.scd.utils.XmlUtil;

/**
 * @author chengdu
 * @date 2019/6/12.
 */
public class ChartFactory {

    public static final String HISTOGRAM = "histogram";
    public static final String LINECHART = "line";
    public static final String PIECHART = "pie";

    public static Chart createChart(String type) throws Exception {
        Chart chart;
        if(HISTOGRAM.equals(type)){
            chart = new HistogramChart();
        }else if(LINECHART.equals(type)){
            chart = new LineChart();
        }else if(PIECHART.equals(type)){
            chart = new PieChart();
        }else{
            throw new Exception("type not find");
        }
        return chart;
    }

    public static void main(String[] args) throws Exception {
//        Chart chart = createChart(PIECHART);
//        chart.display();
        // 读取配置文件决定什么类型的 chart
        String xmlpath = "E:\\Github\\designpattern\\src\\main\\java\\com\\scd\\factory\\simplefactory\\fac\\chartype.xml";
        String chartype = XmlUtil.getCharType(xmlpath);
        Chart chart = createChart(chartype);
        chart.display();
    }
}
