package com.javase.thread;

import java.util.ArrayList;
import java.util.List;

public class ThreadHomework01 {
    public static void main(String[] args) {
        //创建厂库对象,共享
        List list = new ArrayList();
        list.add(0);

        //生产者线程
        Thread t1 = new Thread(new OddNum(list));
        t1.setName("Odd Number ");

        //消费者线程
        Thread t2 = new Thread(new EvenNum(list));
        t2.setName("Even Number ");

        t1.start();
        t2.start();

    }
}

//生产线程
class OddNum implements Runnable{
    //厂库
    private List List;

    public OddNum(java.util.List list) {
        List = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            synchronized (List){
                int x = (int) List.get(0);
                if (x % 2 == 1){
                    try {
                        List.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    List.remove(0);
                    Object obj = ++x;
                    List.add(obj);
                    System.out.println(Thread.currentThread().getName() + " ==> " + obj);

                    //唤醒
                    List.notify();
                }
            }
        }
    }
}

//消费线程
class EvenNum implements Runnable{
    //厂库
    private List List;

    public EvenNum(java.util.List list) {
        List = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            synchronized (List){
                int x = (int) List.get(0);
                if (x % 2 == 0){
                    try {
                        List.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    List.remove(0);
                    Object obj = ++x;
                    List.add(obj);
                    System.out.println(Thread.currentThread().getName() + " ==> " + obj);

                    //唤醒
                    List.notify();
                }
            }
        }
    }
}