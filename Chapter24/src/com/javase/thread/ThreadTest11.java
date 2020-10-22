package com.javase.thread;

import java.util.concurrent.ThreadLocalRandom;

public class ThreadTest11 {
    public static void main(String[] args) {
        Thread.currentThread().setPriority(10);
        System.out.println("Highest Priority = "+ Thread.MAX_PRIORITY);
        System.out.println("Lowest Priority = "+ Thread.MIN_PRIORITY);
        System.out.println("Normal Priority = "+ Thread.NORM_PRIORITY);

        //Current Priority
        System.out.println(Thread.currentThread().getName() + " has a priority of "+Thread.currentThread().getPriority());
        System.out.println();

        //New Thread
        Thread t = new Thread(new MyRunnable4());
        t.setPriority(1);
        t.setName("t");
        t.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + "   " + i);
        }
    }
}

class MyRunnable4 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " has a priority of "+ Thread.currentThread().getPriority());
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + "   " + i);

        }
    }
}
