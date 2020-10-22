package com.javase.thread;

public class ThreadTest07 {
    public static void main(String[] args) {
        Thread t = new MyThread3();
        t.setName("3");
        t.start();

        try {
            t.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("HelloWorld");
    }
}

class MyThread3 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName()+" ==>" + i);
        }
    }
}
