package com.dada.spring.thread.first;

import java.util.concurrent.*;

/**
 * FutureTask可以执行线程后等待线程返回一个结果
 * @author zhoudahua
 * @date 2019/7/29
 * @description
 */
public class FutureTaskTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Future<Integer> future = executorService.submit(() -> {
            TimeUnit.MILLISECONDS.sleep(2000);
            return 1000;
        });
        System.out.println(future.isDone());
        System.out.println(future.get());
        System.out.println(future.isDone());
        executorService.shutdown();
    }
}
