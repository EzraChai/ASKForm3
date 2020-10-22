package com.javase.thread.Exam4;

public class ExamTest01 {
    public static void main(String[] args) {
        MyClass mc = new MyClass();
        MyClass mc2 = new MyClass();
        MyThread t1 = new MyThread(mc);
        MyThread t2 = new MyThread(mc2);

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}

class MyThread extends Thread{
    private MyClass mc;

    public MyThread(MyClass mc) {
        this.mc = mc;
    }

    public void run() {
        if (Thread.currentThread().getName().equals("t1")){
            mc.doSome();
        }
        if (Thread.currentThread().getName().equals("t2")){
            mc.doOther();
        }
    }
}


class MyClass {
    public synchronized static void doOther(){
        System.out.println("Do Other begin");
        System.out.println("Do Other over");
    }
    public synchronized static void doSome(){
        System.out.println("Do some begin");
        try {
            Thread.sleep(1000*10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Do some over");
    }
}
