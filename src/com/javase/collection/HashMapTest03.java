package com.javase.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashMapTest03 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(null,null);
        System.out.println(map.size());
        map.put(null,100);
        System.out.println(map.size());

        System.out.println(map.get(null));
    }
}
