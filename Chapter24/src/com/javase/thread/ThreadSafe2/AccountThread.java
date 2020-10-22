package com.javase.thread.ThreadSafe2;

public class AccountThread extends Thread {

    private Account act;

    public AccountThread (Account act){
        this.act = act;
    }

    public void run(){
        //Withdraw
        double money = 5000;
        act.withdraw(money);
        System.out.println(Thread.currentThread().getName()+" withdraw from Account[ "+act.getAccNum()+" ] completed");
        System.out.println("Account[ "+act.getAccNum()+" ] Balance = " + act.getBalance());
    }
}
