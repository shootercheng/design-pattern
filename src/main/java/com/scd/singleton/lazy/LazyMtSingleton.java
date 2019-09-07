package com.scd.singleton.lazy;

/**
 * @author chengdu
 * 方法上面加锁，比较影响性能
 */
public class LazyMtSingleton {

    private static LazyMtSingleton lazySingleton = null;

    public static synchronized LazyMtSingleton getLazySingletonInstance(){
        if(lazySingleton == null){
            lazySingleton = new LazyMtSingleton();
        }
        return lazySingleton;
    }
}
