package com.javase.Review;

import com.javase.Chapter22.Danlink.Node;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1,"Chloe");
        hm.put(2,"Ezra");
        hm.put(4,"Joanne");
        hm.put(3,"Tiew");
        hm.put(3,"Zoewin");

        System.out.println(hm.size());

        Set<Integer> set = hm.keySet();
        for (Integer key : set){
            System.out.println(key+" " + hm.get(key));
        }

        Set<Map.Entry<Integer,String>> node = hm.entrySet();
        for (Map.Entry<Integer,String> nodes : node){
            System.out.println(nodes.getKey()+"   "+ nodes.getValue());
        }

        System.out.println(node);
    }
}
