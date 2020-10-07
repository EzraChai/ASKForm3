package com.javase.collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest01 {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("A");
        treeSet.add("Z");
        treeSet.add("F");
        treeSet.add("C");
        treeSet.add("G");
        treeSet.add("B");

        for (String s : treeSet){
            System.out.println(s);
        }
    }
}
