package com.scd.singleton.lazy;

/**
 * @author chengdu
 */
public class LazyBkSingleton {

    private static LazyBkSingleton lazyBkSingleton = null;

    private LazyBkSingleton(){
    }

    public static LazyBkSingleton getLazyBkSingletonInstance(){
        if(lazyBkSingleton == null){
            synchronized (LazyBkSingleton.class){
                if(lazyBkSingleton == null){
                    lazyBkSingleton = new LazyBkSingleton();
                }
            }
        }
        return lazyBkSingleton;
    }
}
