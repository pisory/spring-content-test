package com.dada.spring.thread.jmm;

/**
 * @author zhoudahua
 * @date 2019/8/7
 * @description
 */
public class HappenBeforeTest {
    static volatile boolean flag = false;
    static int a = 20;
    public static void main(String[] args) {
            new Thread(()-> {
                a = 40;
                flag = true;
            }).start();


            new Thread(()-> {
                if(flag){
                    System.out.println(a);
                }
            }).start();

    }
}
