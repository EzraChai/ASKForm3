package com.javase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest06 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        //Iterator it = c.iterator();

        c.add(1);
        c.add(2);
        c.add(3);

        Iterator it = c.iterator();
        while(it.hasNext()){
            Object object = it.next();
            System.out.println(object);
        }

        Collection c2 = new ArrayList();
        c2.add("abc");
        c2.add("def");
        c2.add("hij");

        Iterator it2 = c2.iterator();
        while (it2.hasNext()){
            Object o = it2.next();
            //delete current index
            it2.remove();
            System.out.println(c2.size());     System.out.println(o);
        }
        System.out.println(c2.size());
    }
}
