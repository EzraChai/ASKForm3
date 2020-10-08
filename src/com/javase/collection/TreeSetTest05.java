package com.javase.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest05 {
    public static void main(String[] args) {
        //TreeSet<Tortoise> tortoiseTreeSet = new TreeSet<>();
        TreeSet<Tortoise> tortoises = new TreeSet<>(new TortoiseComparator());

        tortoises.add(new Tortoise(440));
        tortoises.add(new Tortoise(230));
        tortoises.add(new Tortoise(390));

        for(Tortoise t : tortoises){
            System.out.println(t);
        }
    }
}

class Tortoise{
    int age;

    public Tortoise(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Tortoise[" +
                "age ==> " + age +
                ']';
    }
}

class TortoiseComparator implements Comparator<Tortoise> {

    @Override
    public int compare(Tortoise o1, Tortoise o2) {
        return o1.age - o2.age;
    }
}
