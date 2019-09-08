package com.scd.prototype.exercise.second;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chengdu
 * @date 2019/9/8.
 */
public class TemplateManager {

    private static Map<String, DocTemplate> map = new HashMap<>();

    static {
        map.put(TemplateType.ONE.name().toLowerCase(), new TypeOneTemplate());
        map.put(TemplateType.TWO.name().toLowerCase(), new TypeTwoTemplate());
    }

    public static void add(String key, DocTemplate docTemplate){
        map.put(key, docTemplate);
    }

    public static DocTemplate get(String key){
        DocTemplate docTemplate = map.get(key);
        return docTemplate.clone();
    }
}
