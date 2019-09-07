package com.scd.singleton.eager;

/**
 * @author chengdu
 * Eager Singleton 饿汉式单例模式
 */
public class EagerSingleton {

    private static final EagerSingleton eagerSingleton = new EagerSingleton();

    public static EagerSingleton getEagerSingletonInstance(){
        return eagerSingleton;
    }
}
