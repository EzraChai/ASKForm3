package com.javase.collection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap();
        map.put(1,"Hi");
        map.put(2,"Name");
        map.put(3,"Is");
        map.put(4,"Chai Juan Zhe");

        String value = map.get(2);
        System.out.println(value);

        System.out.println("=> "+map.size());
        map.remove(1);
        System.out.println("==> "+map.size());

        System.out.println(map.containsKey(4));
        System.out.println(map.containsValue("Name"));

        Collection<String> values = map.values();
        for (String s : values){
            System.out.println(s);
        }

        map.clear();
        System.out.println(map.size());
        System.out.println(map.isEmpty());
    }
}
