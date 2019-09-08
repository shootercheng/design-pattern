package com.scd.prototype.shallow;

/**
 * @author chengdu
 * @date 2019/9/8.
 */
public class ShallowTest {

    public static void main(String[] args){
        Attachment attachment = new Attachment("attachment");
        WeeklyLog weeklyLog = new WeeklyLog("weeklylog","2019/9/8","study", attachment);
        WeeklyLog weeklyLog_clone = weeklyLog.clone();
        System.out.println(weeklyLog == weeklyLog_clone);
        weeklyLog_clone.setName("weeklylog1");
        System.out.println(weeklyLog.getAttachment() == weeklyLog_clone.getAttachment());
        weeklyLog_clone.getAttachment().setName("attachment1");
        System.out.println(weeklyLog.getAttachment().getName().equals(weeklyLog_clone.getAttachment().getName()));
    }
}
