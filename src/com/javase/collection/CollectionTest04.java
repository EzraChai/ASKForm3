package com.javase.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest04 {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        String s1 = new String("Chloe");
        c.add(s1);

        String s2 = new String("Gan");
        c.add(s2);

        System.out.println("Size --> "+c.size());

        String x = new String("Chloe");
        System.out.println(c.contains(x));
    }
}
