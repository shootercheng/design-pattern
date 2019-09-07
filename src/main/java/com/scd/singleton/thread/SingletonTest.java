package com.scd.singleton.thread;

import com.scd.singleton.lazy.LazyBkVolSingleton;
import com.scd.singleton.lazy.LazySingleton;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author chengdu
 */
public class SingletonTest {

    public static void main(String[] args) throws Exception {
        ExecutorService threadPool = Executors.newFixedThreadPool(30);
        CountDownLatch latch=new CountDownLatch(30);
        for(int i = 0; i < 30; i++) {
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    LazySingleton lazySingleton = LazySingleton.getLazySingletonInstance();
                    System.out.println(System.currentTimeMillis() + "----" +lazySingleton);
                    LazyBkVolSingleton lazyBkVolSingleton = LazyBkVolSingleton.getLazyBkVolSingletonInstance();
                    System.out.println("safe volatile" + System.currentTimeMillis() + "----" +lazyBkVolSingleton);
                    latch.countDown();
                }
            });
        }
        latch.await();
        System.out.println("running over");
        threadPool.shutdown();
        String name1 = new String("cd");
        String name2 = new String("cd");
        System.out.println(name1 == name2);
    }
}
