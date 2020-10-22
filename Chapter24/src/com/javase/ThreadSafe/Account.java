package com.javase.ThreadSafe;

public class Account {
    private String accNum;
    private double balance;

    public Account() {
    }

    public Account(String accNum, double balance) {
        this.accNum = accNum;
        this.balance = balance;
    }

    public String getAccNum() {
        return accNum;
    }

    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public void withdraw(double money){
        //Before
        double before = this.getBalance();
        //After
        double after = before - money;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Refresh
        this.setBalance(after);
    }
}
