package com.dada.spring.thread.first;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author zhoudahua
 * @date 2019/7/30
 * @description
 */
public class CountDownLatchTest {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(15);
        ExecutorService executorService = Executors.newFixedThreadPool(15);
        for (int i = 0; i < 15; i++) {
            int finalI = i;
            executorService.execute(() -> {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(finalI);
                latch.countDown();
            });

        }
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("---------------end---------------");
        executorService.shutdown();
    }
}
