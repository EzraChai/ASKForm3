package com.javase.thread;

public class ThreadTest10 {
    public static void main(String[] args) {
        MyRunnable3 r = new MyRunnable3();
        Thread t = new Thread(r);
        t.setName("t");
        t.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        r.run = false;
        System.out.println("Hello");
    }
}

class MyRunnable3 implements Runnable{
    boolean run = true;

    @Override
    public void run(){
            for (int i = 1; i < 11; i++) {
                if (run) {
                    System.out.println(Thread.currentThread().getName() + " ==> " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    return;
                }
            }
    }
}
