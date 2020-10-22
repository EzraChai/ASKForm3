package com.javase.thread;

public class ThreadTest08 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.setName("t");
        t.start();

        try {
            Thread.sleep(1000*2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //干扰他
        t.interrupt();
    }
}

class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Begin");
        try {
            Thread.sleep(1000*60*60*24*365);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " End");
    }
}