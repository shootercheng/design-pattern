package com.scd.builder.actorbuilder;

/**
 * @author chengdu
 * @date 2019/7/30.
 */
public class AngleBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        getActor().setType("angle type");
    }

    @Override
    public void buildSex() {
        getActor().setSex("angle sex");
    }

    @Override
    public void buildFace() {
        getActor().setFace("angle face");
    }

    @Override
    public void buildCostume() {
        getActor().setCostume("angle costume");
    }

    @Override
    public void buildHairstyle() {
        getActor().setHairstyle("angle hairstyle");
    }
}
