package com.javase.thread;

public class ThreadTest04 {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Inner class ==> " + i);
                }
            }
        });
        t.start();
    }
}
