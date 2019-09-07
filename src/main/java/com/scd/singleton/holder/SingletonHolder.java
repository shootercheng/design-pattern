package com.scd.singleton.holder;

/**
 * @author chengdu
 */
public class SingletonHolder {

    private SingletonHolder(){

    }

    private static class HolderClass {
        private final static SingletonHolder singletonHolder = new SingletonHolder();
    }

    public static SingletonHolder getSingletonHolderInstance(){
        return HolderClass.singletonHolder;
    }

    public static void main(String[] args){
        SingletonHolder singletonHolder = getSingletonHolderInstance();
        SingletonHolder singletonHolder1 = getSingletonHolderInstance();
        System.out.println(singletonHolder == singletonHolder1);
    }
}
