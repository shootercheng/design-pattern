package com.scd.singleton;

import com.scd.singleton.eager.EagerSingleton;
import com.scd.singleton.lazy.LazySingleton;
import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author chengdu
 */
public class SingletonTest {

    /**
     * 单线程访问
     */
    @Test
    public void testEagerSingleton(){
        for(int i = 0; i < 10; i++){
            EagerSingleton eagerSingleton = EagerSingleton.getEagerSingletonInstance();
            System.out.println(eagerSingleton);
        }
    }

    @Test
    public void testMultiSingleton(){
        ExecutorService threadPool = Executors.newFixedThreadPool(30);
        for(int i =0; i < 30; i++) {
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(EagerSingleton.getEagerSingletonInstance());
                }
            });
        }
        threadPool.shutdown();
    }

    @Test
    public void testLazySingleton(){
        for(int i =0; i < 10; i++){
            LazySingleton lazySingleton = LazySingleton.getLazySingletonInstance();
            System.out.println(lazySingleton);
        }
    }

    @Test
    public void testMultiLazySingleton(){
        ExecutorService threadPool = Executors.newFixedThreadPool(30);
        for(int i =0; i < 30; i++) {
//            System.out.println("-----------------------"+i);
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() +"----"+ LazySingleton.getLazySingletonInstance());
                }
            });
        }
//        threadPool.shutdown();
    }

}
