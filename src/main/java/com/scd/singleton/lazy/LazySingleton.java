package com.scd.singleton.lazy;

/**
 * @author chengdu
 * Lazy Singleton 懒汉式单例模式，
 * 存在多线程访问时可能生成多个实例
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    // 私有构造方法，外部禁止构造
    private LazySingleton(){

    }

    public static LazySingleton getLazySingletonInstance(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
