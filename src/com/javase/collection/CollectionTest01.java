package com.javase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class CollectionTest01 {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        c1.add(1200);
        c1.add(3.1415);
        c1.add(new Object());
        c1.add(new Student());
        c1.add(true);

        System.out.println(c1.size());

        c1.clear();
        System.out.println("After clear "+c1.size());

        c1.add("I love Chloe.");
        c1.add("LOVE");
        c1.add("ME");

        System.out.println("After putting in data "+c1.size());

        boolean flag = c1.contains("LOVE");
        System.out.println(flag);
        boolean flag2 = c1.contains("Hate");
        System.out.println(flag2);

        //remove
        c1.remove("ME");
        System.out.println("Remove a data : "+c1.size());

        System.out.println("Is  C1 EMPTY? Answer --> "+c1.isEmpty());
        c1.clear();
        System.out.println("After clear , is  C1 EMPTY? Answer --> "+c1.isEmpty());
        System.out.println();

        c1.add("I ");
        c1.add("LOVE ");
        c1.add("CHLOE ");

        Object []collection = c1.toArray();
        for (int i = 0; i < collection.length; i++) {
            System.out.println(collection[i]);
        }
    }
}

class Student{
    private String studentId;
}
