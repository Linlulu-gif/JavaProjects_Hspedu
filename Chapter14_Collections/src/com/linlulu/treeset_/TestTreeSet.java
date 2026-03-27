package com.linlulu.treeset_;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author 林露露
 * @version 1.0
 *
 */
public class TestTreeSet {
    /**
     * 演示 TreeSet的使用方法，了解TreeSet的底层源码
     * @param args
     */
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        //1.add
        treeSet.add(12);
        treeSet.add(17);
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(92);
        treeSet.add(12);
        treeSet.add(92);
        treeSet.add(82);
        treeSet.add(678);
        System.out.println(treeSet);
        //[1, 2, 12, 17, 82, 92, 678],默认按照升序的排序方式有序

        //2.remove
        treeSet.remove(82);

        //3.lower 和 higher方法
        System.out.println(treeSet.lower(92));
        System.out.println(treeSet.higher(92));
    }
}
