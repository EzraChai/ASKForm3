package com.javase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionTest03 {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        c1.add("I");
        c1.add("LOVE");
        c1.add("CHLOE");
        c1.add("GAN");

        Iterator it = c1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        //HashCode is very messy but can be insert a same value again
        Collection c2 = new HashSet();
        c2.add("I");
        c2.add("LOVE");
        c2.add("CHLOE");
        c2.add("GAN");
        Iterator it2 = c2.iterator();
        while (it2.hasNext()){
            System.out.println(it2.next());
        }
    }
}
