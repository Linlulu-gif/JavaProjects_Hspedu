package com.linlulu.homework.bank_;

//在这里体会重写的好处---------

/**
 * 在实际开发中，基础性代码功能完善的都比较好了
 * 针对新功能 或 业务模块 调用 基础性 模块的 方法（或重写）
 * 避免了去重复实现复杂逻辑，大大提高了开发效率
 *
 * 如：真正银行 取/存 钱。验证的数据或安全逻辑很多，但我重写方法不需要考虑其内部繁琐的逻辑
 */
public class CheckingAccount extends BankAccount{
    //没有特别属性


    public CheckingAccount(double balance) {//父类初始化
        super(balance);
    }

    @Override
    public void deposit(double saveMoney) {//重写deposit方法
        super.deposit(saveMoney - 1);//银行收 1 元 手续费
    }

    @Override
    public void withdraw(double costMoney) {//重写withdraw方法
        super.withdraw(costMoney + 1);//银行收取 1 元 手续费
    }
}
