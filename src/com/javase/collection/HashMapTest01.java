package com.javase.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest01 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(101,"zhangsan");
        map.put(201,"lisi");
        map.put(301,"wangwu");
        map.put(101,"king");

        System.out.println(map.size());

        Set<Map.Entry<Integer,String>> set = map.entrySet();
        for( Map.Entry<Integer,String> entry : set){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
