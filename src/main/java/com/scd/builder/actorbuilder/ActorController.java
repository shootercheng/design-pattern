package com.scd.builder.actorbuilder;

/**
 * @author chengdu
 * @date 2019/7/30.
 */
public class ActorController {

    private ActorBuilder actorBuilder;

    public ActorController(ActorBuilder actorBuilder){
        this.actorBuilder = actorBuilder;
    }

    public Actor construct(){
        actorBuilder.buildType();
        actorBuilder.buildSex();
        actorBuilder.buildFace();
        actorBuilder.buildCostume();
        if (!actorBuilder.isBareHeaded()) {
            actorBuilder.buildHairstyle();
        }
        return actorBuilder.getActor();
    }
}
