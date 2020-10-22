package com.javase.thread;

public class ThreadTest12 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable5());
        t.setName("t");
        t.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + "   " + i );
        }
    }
}

class MyRunnable5 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            if (i % 100 == 0){
                Thread.yield();
                System.out.println(Thread.currentThread().getName() + "   " + i );

            }
        }
    }
}
