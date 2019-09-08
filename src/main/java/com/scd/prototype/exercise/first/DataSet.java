package com.scd.prototype.exercise.first;

import java.io.Serializable;

/**
 * @author chengdu
 * @date 2019/9/8.
 */
public class DataSet implements Serializable {

    private String color;

    private String data;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public DataSet(String color, String data) {
        this.color = color;
        this.data = data;
    }

    @Override
    public String toString() {
        return "DataSet{" +
                "color='" + color + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
