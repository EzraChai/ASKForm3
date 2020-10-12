package com.javase.thread;

public class ThreadTest03 {
    public static void main(String[] args) {
        //Myrunnable mr = new Myrunnable();
        //Thread t = new Thread(mr);
        Thread t = new Thread(new Myrunnable());

        t.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("Main ==> " + i);
        }
    }
}

class Myrunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Runnable ==> " + i);
        }
    }
}
