package com.javase.thread;

import java.util.ArrayList;
import java.util.List;

public class ThreadTest16 {
    public static void main(String[] args) {
        //创建厂库对象,共享
        List list = new ArrayList();

        //生产者线程
        Thread t1 = new Thread(new Producer(list));
        t1.setName("Producer Thread ");

        //消费者线程
        Thread t2 = new Thread(new Consumer(list));
        t2.setName("Consumer Thread ");

        t1.start();
        t2.start();

    }
}

//生产线程
class Producer implements Runnable{
    //厂库
    private List List;

    public Producer(java.util.List list) {
        List = list;
    }

    @Override
    public void run() {
        //一直生产
        while (true){
            //给厂库对象List加锁
            synchronized (List){
                if (List.size() > 0){
                    try {
                        List.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //厂库已空，可以生产
                Object obj = new Object();
                List.add(obj);
                System.out.println(Thread.currentThread().getName() + " ==> " + obj);

                //唤醒消费者进行消费
                List.notify();
            }
        }
    }
}

//消费线程
class Consumer implements Runnable{
    //厂库
    private List List;

    public Consumer(java.util.List list) {
        List = list;
    }

    @Override
    public void run() {
        //一直消费
        while (true){
            synchronized (List){
                if (List.size() == 0){
                    try {
                        List.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //厂库有东西，需要消费
                Object obj = List.remove(List.size()-1);
                System.out.println(Thread.currentThread().getName() + " ==> " + obj);

                //唤醒生产者
                List.notify();
            }
        }
    }
}