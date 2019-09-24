package com.dada.cpu;

/**
 * @author zhoudahua
 * @date 2019/6/19
 * @description
 */
public class Test implements Runnable{

    @Override
    public void run() {
        int time = 100000;
        for (int i = 0; i < time; i++) {
            System.out.println(i);
            String string = "I am tony ~";
            System.out.println(string + i);
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        for (int i = 0; i < 10; i++) {
            /*Thread thread = new Thread(test);
            thread.start();*/
        }
    }
}
