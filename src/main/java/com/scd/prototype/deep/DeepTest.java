package com.scd.prototype.deep;

/**
 * @author chengdu
 * @date 2019/9/8.
 */
public class DeepTest {

    public static void main(String[] args){
        Attachment attachment = new Attachment("attachment");
        WeeklyLog weeklyLog = new WeeklyLog("weeklylog","2019/9/8", "study", attachment);
        WeeklyLog weeklyLog_clone = weeklyLog.deepClone();
        System.out.println(weeklyLog == weeklyLog_clone);
        System.out.println(weeklyLog.getAttachment() == weeklyLog_clone.getAttachment());
    }
}
