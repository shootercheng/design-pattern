package com.scd.prototype.exercise.second;

/**
 * @author chengdu
 * @date 2019/9/8.
 */
public class TemplateManagerTest {

    public static void main(String[] args){
        DocTemplate docTemplate1 = TemplateManager.get(TemplateType.ONE.name().toLowerCase());
        DocTemplate docTemplate2 = TemplateManager.get(TemplateType.ONE.name().toLowerCase());
        System.out.println(docTemplate1 == docTemplate2);
    }
}
