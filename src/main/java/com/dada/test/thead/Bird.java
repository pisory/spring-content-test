package com.dada.test.thead;

public abstract class Bird {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int fly();

    public static class Suspend {

        public static class MyThread extends Thread{
            public  MyThread(String name) {
                super.setName(name);
            }

            @Override
            public void run() {
                System.out.println("I am " + getName());
                Thread.currentThread().suspend();
            }
        }

        public static void main(String[] args) throws InterruptedException {
            Thread t1 = new MyThread("t1");
            Thread t2 = new MyThread("t2");

            t1.start();
            Thread.sleep(100);
            t2.start();

            t1.resume();
            t2.resume();
            t1.join();
            t2.join();

        }
    }
}
