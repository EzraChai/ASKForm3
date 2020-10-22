package com.javase.thread;

import java.security.cert.TrustAnchor;

public class ThreadTest14 {
    public static void main(String[] args) {
        BackupDataThread bdT1 = new BackupDataThread();
        bdT1.setName("T1");
        bdT1.setDaemon(true);
        bdT1.start();


        for (int i = 0; i < 11; i++) {
            System.out.println(Thread.currentThread().getName() + " ===> " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class BackupDataThread extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (true){
            System.out.println(Thread.currentThread().getName() + " --> "+ ++i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}