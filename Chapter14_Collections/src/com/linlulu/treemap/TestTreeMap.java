package com.linlulu.treemap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author 林露露
 * @version 1.0
 * 在这里研究 TreeMap的实现细节；常用方法
 */
public class TestTreeMap {
    public static void main(String[] args) {
        /**
         * 1.首先研究 HashMap 的 诸多方法
         */
        //1.put(K,V)
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(1,2);
        hashMap.put(2,5);
        hashMap.put(3,4);
        hashMap.put(4,3);
        hashMap.put(5,4);
        hashMap.put(6,3);
        hashMap.put(7,1);
        hashMap.put(8,9);
        //2.containsKey or containsValue
        hashMap.containsKey(2);//boolean
        hashMap.containsValue(9);
        //3.entrySet
        Set<Map.Entry<Integer, Integer>> entries = hashMap.entrySet();
        //4.get(K)
        hashMap.get(2);
        //5.
        hashMap.getOrDefault(2,0);//若是有key,则直接拿到，否则存入K-DefaultValue

        /**
         * 演示 TreeMap
         */
        TreeMap<Integer, Integer> integerIntegerTreeMap = new TreeMap<>();

    }
}
