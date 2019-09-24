package com.dada.spring.thread.first;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author zhoudahua
 * @date 2019/7/29
 * @description
 */
public class FixedThreadPoolTest {
    public synchronized static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 6; i++) {
            executorService.execute(() -> {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());

            });
        }

        executorService.shutdown();
        System.out.println(executorService.isTerminated());
        System.out.println(executorService.isShutdown());
        System.out.println(executorService);
            Thread.sleep(5000);


        System.out.println(executorService.isTerminated());
        System.out.println(executorService.isShutdown());
        System.out.println(executorService);
    }
}
