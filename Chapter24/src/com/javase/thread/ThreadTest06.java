package com.javase.thread;

public class ThreadTest06 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome boy!");
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("HelloWorld");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Turn = "+i);
            Thread.sleep(1000);
        }
    }

}
