package com.javase.collection;

import java.util.TreeSet;

public class TreeSetTest04 {
    public static void main(String[] args) {
        VIP v1 = new VIP("Chai",15);
        VIP v2 = new VIP("Chloe",15);
        VIP v3 = new VIP("John",16);

        TreeSet<VIP> ts = new TreeSet<>();
        ts.add(v1);
        ts.add(v2);
        ts.add(v3);

        for (VIP sortVip : ts){
            System.out.println(sortVip);
        }

    }
}

class VIP implements Comparable<VIP> {
    String name;
    int age;

    public VIP(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name : " + name + ", Age : " + age;
    }

    @Override
    public int compareTo(VIP v) {
        if (this.age == v.age) {
            return this.name.compareTo(v.name);
        }else{
            return this.age - v.age;
        }
    }
}
