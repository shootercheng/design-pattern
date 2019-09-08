package com.scd.prototype.deep;

import java.io.Serializable;

/**
 * @author chengdu
 * @date 2019/9/8.
 */
public class Attachment implements Cloneable, Serializable {

    private String name;

    public Attachment(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
