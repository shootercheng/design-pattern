package com.scd.prototype.exercise.second;

/**
 * @author chengdu
 * @date 2019/9/8.
 */
public class TypeOneTemplate extends DocTemplate implements Cloneable {

    private String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public TypeOneTemplate clone(){
        Object object = super.clone();
        return (TypeOneTemplate) object;
    }
}
