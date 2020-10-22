package com.javase.ThreadSafe;

public class AccountThread extends Thread {

    private Account act;

    public AccountThread (Account act){
        this.act = act;
    }

    public void run(){
        //Withdraw
        double money = 5000;
        act.withdraw(money);
        System.out.println("Account[ "+Thread.currentThread().getName()+" ] Withdraw completed");
        System.out.println("Account[ "+Thread.currentThread().getName()+" ] Balance = " + act.getBalance());
    }
}
