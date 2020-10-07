package com.javase.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest01 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Hello");
        set.add("I love Chloe.");

        for (String s : set){
            System.out.println(s);
        }
    }
}
