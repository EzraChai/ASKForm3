package com.javase.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List myList = new ArrayList();
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("C");

        //Lesser use
        myList.add(1,"KING");

        Iterator it = myList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        Object firstObj = myList.get(0);
        System.out.println("First index : "+ firstObj);

        for (int i = 0; i < myList.size(); i++) {
            System.out.println("Using get to print all the index : "+ myList.get(i));
        }

        System.out.println("Check the index of C : "+myList.indexOf("C"));

        System.out.println("Last index of C =>  "+myList.lastIndexOf("C"));

        myList.remove(0);
        Iterator it2 = myList.iterator();
        while (it2.hasNext()){
            System.out.println(it2.next());
        }
        System.out.println();

        myList.set(2,"Chloe");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
}
