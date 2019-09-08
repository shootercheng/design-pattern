package com.scd.prototype.exercise.second;

/**
 * @author chengdu
 * @date 2019/9/8.
 */
public class TypeTwoTemplate extends DocTemplate implements Cloneable {

    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public TypeTwoTemplate clone(){
        Object o = super.clone();
        return (TypeTwoTemplate) o;
    }
}
