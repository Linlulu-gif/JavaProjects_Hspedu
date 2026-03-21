package com.linlulu.homework.bank_;

public class Homework_08 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(50000);
        bankAccount.deposit(20000);
        bankAccount.deposit(20000);
        bankAccount.deposit(20000);
        System.out.println(bankAccount.getBalance());

        bankAccount = new CheckingAccount(2000);
        bankAccount.deposit(5000);//2000+5000 ->7000 -1 = 6999
        System.out.println(bankAccount.getBalance());
        bankAccount.withdraw(3000);
        System.out.println(bankAccount.getBalance());//6999-3000-1=

        bankAccount = new SavingAccount(1000,0.23,5);
        bankAccount.withdraw(100);
        bankAccount.withdraw(100);
        bankAccount.withdraw(100);
        bankAccount.withdraw(100);
        bankAccount.withdraw(100);//500
        System.out.println(bankAccount.getBalance());

        bankAccount.deposit(100);//count=0
        System.out.println(bankAccount.getBalance());//600-1=599

        ((SavingAccount) bankAccount).earnMonthlyInterest();//向下转型

        System.out.println(bankAccount.getBalance());//600-1=599
    }
}
