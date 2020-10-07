package com.javase.collection;

import java.util.TreeSet;

public class TreeSetTest02 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Chai Juan Zhe");
        treeSet.add("Chloe Gan");
        treeSet.add("Yuventhiran");
        treeSet.add("Radhinal Amirin");
        treeSet.add("Tan Ker Rou Zoewin");
        treeSet.add("Yeng Ming Ching");

        for (String s : treeSet) {
            System.out.println(s);
        }
    }
}
