package com.scd.prototype.exercise.second;

/**
 * @author chengdu
 * @date 2019/9/8.
 */
public class DocTemplate implements Cloneable {

    private String title;

    private String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public DocTemplate clone(){
        Object object = null;
        try {
            object = super.clone();
            return (DocTemplate) object;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
