package com.javase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class ArrayListTest02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        List list2 = new ArrayList(100);

        Collection c = new HashSet();
        c.add(100);
        c.add(200);
        c.add(300);
        c.add(900);
        c.add(50);

        List myList = new ArrayList(c);
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
}
