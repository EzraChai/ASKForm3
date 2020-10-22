package com.javase.thread.ThreadSafe2;

public class Test {
    public static void main(String[] args) {
        Account act1 = new Account("act-200905",10000);

        Thread t1 = new AccountThread(act1);
        Thread t2 = new AccountThread(act1);

        Account act2 = new Account("act-022505",100000000);

        Thread t3 = new AccountThread(act2);
        Thread t4 = new AccountThread(act2);

        t3.setName("t3");
        t4.setName("t4");

        t3.start();
        t4.start();

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();
    }
}
