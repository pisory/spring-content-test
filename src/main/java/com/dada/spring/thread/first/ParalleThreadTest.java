package com.dada.spring.thread.first;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * 使用多线程并行计算记过
 * @author zhoudahua
 * @date 2019/7/29
 * @description
 */
public class ParalleThreadTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        MyTask myTask1 = new MyTask(1, 20000);
        MyTask myTask2 = new MyTask(20001, 40000);
        MyTask myTask3 = new MyTask(40001, 60000);
        MyTask myTask4 = new MyTask(60001, 80000);
        MyTask myTask5 = new MyTask(80001, 100000);
        Future<List<Integer>> future1 = executorService.submit(myTask1);
        Future<List<Integer>> future2 = executorService.submit(myTask2);
        Future<List<Integer>> future3 = executorService.submit(myTask3);
        Future<List<Integer>> future4 = executorService.submit(myTask4);
        Future<List<Integer>> future5 = executorService.submit(myTask5);
        long start = System.currentTimeMillis();
        future1.get();
        future2.get();
        future3.get();
        future4.get();
        future5.get();
        long end = System.currentTimeMillis();
        System.out.println(end - start + " ms");
        //需要手动关闭线程池
        executorService.shutdown();
    }

    static class MyTask implements Callable<List<Integer>>{

        int startPos, endPos;
        public MyTask(int startPos, int endPos) {
            this.startPos = startPos;
            this.endPos = endPos;
        }

        @Override
        public List<Integer> call() throws Exception {
            List<Integer> prime = getPrime(startPos, endPos);
            return prime;
        }
    }

    static List<Integer> getPrime(int start, int end){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = start;i < end;i ++) {
            if(isPrime(i) && i != 1){
                list.add(i);
            }
        }
        System.out.println("fdsfds");
        return  list;
    }

    static boolean isPrime(int num) {
        for(int i = 2;i < Math.sqrt(num); i++){
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
