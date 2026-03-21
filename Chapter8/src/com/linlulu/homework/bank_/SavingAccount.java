package com.linlulu.homework.bank_;

public class SavingAccount extends BankAccount{//新类
    //特别属性
    private double rate;//存款利率-----按月计算,一般 0-1之间
    private int count = 3;//免除手续费次数

    public SavingAccount(double balance, double rate, int count) {
        super(balance);
        this.rate = rate;
        this.count = count;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void deposit(double saveMoney) {//又需要重写deposit方法
        //先判断 count > 0 否
        if(count > 0){//本次免除手续费
            super.deposit(saveMoney);
            count --;
        } else {
            super.deposit(saveMoney - 1);//扣除手续费
        }
    }

    @Override
    public void withdraw(double costMoney) {
        if(count > 0){
            super.withdraw(costMoney);
            count --;
        } else {
            super.withdraw(costMoney + 1);
        }
    }

    public void earnMonthlyInterest(){
        count = 3;//重置交易次数
        //计算本息和
        super.setBalance(getBalance() * (1 + rate));
    }
}
