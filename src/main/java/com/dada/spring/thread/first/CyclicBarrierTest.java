package com.dada.spring.thread.first;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * CyclicBarrier:等待所有线程都准备好了，在一起执行
 * @author zhoudahua
 * @date 2019/7/30
 * @description
 */
public class CyclicBarrierTest {

    static CyclicBarrier cyclicBarrier = new CyclicBarrier(5);

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(16);
        for (int i = 1; i <= 5; i++) {
            int finalI = i;
            executorService.execute(() -> {
                test(finalI);
            });
        }
        executorService.shutdown();
    }

    private static void test(int i) {
        System.out.println("before" + "---" + i);
        try {
            cyclicBarrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
        System.out.println("after" + "---" + i);
    }


}
