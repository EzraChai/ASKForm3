package com.javase.Review;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Chloe");
        myList.add("Ezra");

        System.out.println(myList.get(0));
        System.out.println();

        for (String s : myList){
            System.out.println(s);
        }
        System.out.println("-------------------------------------");

        Iterator<String> it = myList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("-------------------------------------");

        for (Iterator<String>it2 = myList.iterator() ; it2.hasNext();){
            System.out.println(it2.next());
        }
    }
}
