package com.javase.thread;

public class ThreadTest05 {
    public  void doSome(){
        System.out.println("Name ==> "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadTest05 threadTest05 = new ThreadTest05();
        threadTest05.doSome();

        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName());

        MyThread2 thread2 = new MyThread2();
        thread2.start();
        thread2.setName("Chloe");
        System.out.println(thread2.getName());

        MyThread2 thread21 = new MyThread2();
        thread21.start();
        System.out.println(thread21.getName());
    }
}

class MyThread2 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread ==> " + i);
        }
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName());

    }
}