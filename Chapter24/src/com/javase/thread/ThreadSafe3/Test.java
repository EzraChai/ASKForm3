package com.javase.thread.ThreadSafe3;

public class Test {
    public static void main(String[] args) {
        Account act1 = new Account("act-200905",10000);

        Thread t1 = new AccountThread(act1);
        Thread t2 = new AccountThread(act1);

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();
    }
}
