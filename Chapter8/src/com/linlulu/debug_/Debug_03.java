package com.linlulu.debug_;

import java.util.Arrays;

public class Debug_03 {
    //演示 如何追溯源码的执行过程
    //tip: 将光标放在 某个变量上 可以看到最新的数据

    public static void main(String[] args) {
        // debug 源码

        double arr[] = {12, 13.5, 18, 9, -2.3, -5};
        //我们想看看Arrays.sort 的底层的实现
        // 1. 将断点设在需要查看的方法那一行
        // 2. 方法1：点击 force step into (不值得推荐)
        // 3. 方法2：配置一下，请查看老韩提供的文档
        //点击Setting --> Build,Execution,Deployment --> Debugger --> Stepping
        //把Do not step into the classes中的java.*，javax.*取消勾选，其他的随意，
        //就可以进入源码了 F7
        // shift + f8 跳出一层方法
        Arrays.sort(arr);//java.util 提供的方法

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
