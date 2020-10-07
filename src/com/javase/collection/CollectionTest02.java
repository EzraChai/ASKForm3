package com.javase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest02 {
    public static void main(String[] args) {
        Collection c = new ArrayList();// no one cares about he back
        c.add("d");
        c.add("e");
        c.add("f");
        c.add(100);

        Iterator i = c.iterator();

        //metod for iterator
        //boolean hasNext = i.hasNext();
        //Object obj = i.hasNext();

        //next//give back next value
       /*
        boolean hasNext = i.hasNext();
        if(hasNext){
            System.out.println(i.next());
        }else{
            return;
        }

        */
        while(i.hasNext()){
            System.out.println(i.next());
        }

    }
}
