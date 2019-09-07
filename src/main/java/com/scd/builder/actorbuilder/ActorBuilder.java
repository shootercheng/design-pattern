package com.scd.builder.actorbuilder;

/**
 * @author chengdu
 * @date 2019/7/30.
 */
public abstract class ActorBuilder {

    private Actor actor = new Actor();

    public abstract void buildType();
    public abstract void buildSex();
    public abstract void buildFace();
    public abstract void buildCostume();
    public abstract void buildHairstyle();

    public Actor getActor(){
        return actor;
    }

    /**
     * 钩子方法 Hook Method
     * @return
     */
    public boolean isBareHeaded(){
        return false;
    }
}
