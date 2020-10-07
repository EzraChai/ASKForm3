package com.javase.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachTest02 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("I");
        myList.add(" Love");
        myList.add(" Chloe");

        Iterator<String> it = myList.iterator();
        while (it.hasNext()){
            System.out.print(it.next());
        }
        System.out.println();

        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i));
        }
        System.out.println();

        for (String s : myList){
            System.out.print(s);
        }
    }
}
