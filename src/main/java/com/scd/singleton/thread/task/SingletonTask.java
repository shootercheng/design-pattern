package com.scd.singleton.thread.task;

import com.scd.singleton.lazy.LazySingleton;
import com.scd.singleton.thread.result.SingletonResult;

import java.util.concurrent.Callable;

/**
 * @author chengdu
 */
public class SingletonTask implements Callable<SingletonResult>{

    private Integer number;

    public SingletonTask(Integer number){
        this.number = number;
    }

    @Override
    public SingletonResult call() throws Exception {
        SingletonResult singletonResult = new SingletonResult(number);
        LazySingleton lazySingleton = LazySingleton.getLazySingletonInstance();
        Thread.sleep(3000);
        singletonResult.setLazySingleton(lazySingleton);
        return singletonResult;
    }
}
