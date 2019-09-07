package com.scd.singleton.lazy;

/**
 * @author chengdu
 */
public class LazyBkVolSingleton {

    private static volatile LazyBkVolSingleton lazyBkVolSingleton = null;

    public static LazyBkVolSingleton getLazyBkVolSingletonInstance(){
        if(lazyBkVolSingleton == null){
            synchronized (LazyBkVolSingleton.class){
                if(lazyBkVolSingleton == null){
                    lazyBkVolSingleton = new LazyBkVolSingleton();
                }
            }
        }
        return lazyBkVolSingleton;
    }
}
