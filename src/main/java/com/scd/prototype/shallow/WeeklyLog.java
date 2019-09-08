package com.scd.prototype.shallow;

/**
 * @author chengdu
 * @date 2019/9/8.
 */
public class WeeklyLog implements Cloneable {

    private String name;

    private String date;

    private String content;

    private Attachment attachment;

    public WeeklyLog(String name, String date, String content, Attachment attachment) {
        this.name = name;
        this.date = date;
        this.content = content;
        this.attachment = attachment;
    }

    public WeeklyLog clone(){
        Object object = null;
        try {
            object = super.clone();
            return (WeeklyLog) object;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }
}
