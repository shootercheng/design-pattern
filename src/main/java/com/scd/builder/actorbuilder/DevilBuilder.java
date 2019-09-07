package com.scd.builder.actorbuilder;

/**
 * @author chengdu
 * @date 2019/7/30.
 */
public class DevilBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        getActor().setType("devil type");
    }

    @Override
    public void buildSex() {
        getActor().setSex("devil sex");
    }

    @Override
    public void buildFace() {
        getActor().setFace("devil face");
    }

    @Override
    public void buildCostume() {
        getActor().setCostume("devil costume");
    }

    @Override
    public void buildHairstyle() {
        getActor().setHairstyle("devil hairstyle");
    }

    @Override
    public boolean isBareHeaded(){
        return true;
    }
}
