package com.scd.builder.actorbuilder;

import com.scd.utils.XmlUtil;

/**
 * @author chengdu
 * @date 2019/7/30.
 */
public class ActorTest {

    public static void main(String[] args) throws Exception {
//        ActorController actorController = new ActorController(new AngleBuilder());
//        Actor actor = actorController.construct();
//        System.out.println(actor);
        String xmlPath = "builder/actorbuildertype.xml";
        String type = XmlUtil.getClassType(xmlPath);
        Class<?> clazz = Class.forName(type);
        ActorBuilder actorBuilder = (ActorBuilder) clazz.newInstance();
        ActorController actorController = new ActorController(actorBuilder);
        System.out.println(actorController.construct());
    }
}
