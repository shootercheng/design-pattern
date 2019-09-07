package com.scd.builder.actorbuilder;

/**
 * @author chengdu
 * @date 2019/7/30.
 */
public class HeroBuilder extends ActorBuilder {

    @Override
    public void buildType() {
        getActor().setType("hero type");
    }

    @Override
    public void buildSex() {
        getActor().setSex("hero sex");
    }

    @Override
    public void buildFace() {
        getActor().setFace("hero face");
    }

    @Override
    public void buildCostume() {
        getActor().setCostume("hero costume");
    }

    @Override
    public void buildHairstyle() {
        getActor().setHairstyle("hero hairstyle");
    }
}
