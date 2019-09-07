package com.scd.singleton.thread;

import com.scd.singleton.lazy.LazySingleton;
import com.scd.singleton.thread.result.SingletonResult;
import com.scd.singleton.thread.task.SingletonTask;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author chengdu
 */
public class SingletonThreadTest {

    public static void main(String[] args) throws Exception {
        ExecutorService threadPool = Executors.newFixedThreadPool(30);
        List<Future<SingletonResult>> futureList = new ArrayList<>(30);
        long startTime = System.currentTimeMillis();
        System.out.println("start time:"+startTime);
        for(int i = 0; i < 30; i++) {
            SingletonTask singletonTask = new SingletonTask(i);
            Future<SingletonResult> singletonResultFuture = threadPool.submit(singletonTask);
            futureList.add(singletonResultFuture);
        }
        // 验证 get() 方法的阻塞性
        for(Future<SingletonResult> singletonResultFuture : futureList){
            System.out.println(singletonResultFuture.get());
        }
        System.out.println("running over");
        System.out.println("time:"+ (System.currentTimeMillis() - startTime));
        threadPool.shutdown();
    }
}
