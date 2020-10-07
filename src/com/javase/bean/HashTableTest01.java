package com.javase.bean;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableTest01 {
    public static void main(String[] args) {
        Map map = new Hashtable();
        map.put(null,100);
        System.out.println(map.get(null));

        map.put(100,null);
        System.out.println(map.get(10054));
    }

}
