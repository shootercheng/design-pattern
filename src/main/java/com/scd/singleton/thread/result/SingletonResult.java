package com.scd.singleton.thread.result;

import com.scd.singleton.lazy.LazySingleton;

/**
 * @author chengdu
 */
public class SingletonResult {

    private Integer num;

    public LazySingleton getLazySingleton() {
        return lazySingleton;
    }

    public void setLazySingleton(LazySingleton lazySingleton) {
        this.lazySingleton = lazySingleton;
    }

    private LazySingleton lazySingleton;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public SingletonResult(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "SingletonResult{" +
                "num=" + num +
                ", lazySingleton=" + lazySingleton +
                '}';
    }
}
