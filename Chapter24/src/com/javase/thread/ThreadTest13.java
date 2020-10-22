package com.javase.thread;

public class ThreadTest13 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main begin");

        Thread t = new Thread(new MyRunnable6());
        t.setName("t");
        t.start();

        t.join();

        System.out.println("Main stop");
    }
}

class MyRunnable6 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " == " + i);
        }
    }
}
