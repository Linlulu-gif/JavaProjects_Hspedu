package com.linlulu.homework.bank_;

public class BankAccount {
    private double balance;//账户余额

    public BankAccount(double balance) {//带参构造器
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //存款
    public void deposit(double saveMoney){
        balance += saveMoney;
    }

    //取款
    public void withdraw(double costMoney){
        balance -= costMoney;
    }
}
