package com.javase.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadTest15 {
    public static void main(String[] args) {
        FutureTask futureTask = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {
                System.out.println("Call method begin.");
                Thread.sleep(10000);
                System.out.println("Call method end.");
                int a = 100;
                int b = 200;
                return a+b;
            }
        });

        Thread t = new Thread(futureTask);
        t.start();

        try {
            Object obj = futureTask.get();
            System.out.println(obj);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("Hello World");
    }
}

