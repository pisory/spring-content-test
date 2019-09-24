package com.dada.spring.thread.first;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 定时器线程池
 * 可以设定延迟启动和每隔多少毫秒启动执行一次
 * @author zhoudahua
 * @date 2019/7/27
 * @description
 */
public class TestScheduledExecutors {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(4);
        service.scheduleAtFixedRate(() ->{
            try {
                TimeUnit.MICROSECONDS.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
        },0,1000, TimeUnit.MILLISECONDS);
    }
}
