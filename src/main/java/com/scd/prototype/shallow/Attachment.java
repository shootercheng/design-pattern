package com.scd.prototype.shallow;

/**
 * @author chengdu
 * @date 2019/9/8.
 */
public class Attachment {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Attachment(String name) {
        this.name = name;
    }

    public void download(){
        System.out.println("download attachemtn name "+name);
    }
}
