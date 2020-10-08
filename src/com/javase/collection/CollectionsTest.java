package com.javase.collection;

import java.util.*;

public class CollectionsTest {
    public static void main(String[] args) {

        List<String> mylist = new ArrayList<>();

        Collections.synchronizedList(mylist);

        mylist.add("Abc");
        mylist.add("abc");
        mylist.add("ABCdef");

        Collections.sort(mylist);
        for (String s : mylist){
            System.out.println(s);
        }

        System.out.println();

        List<Tortoise2> tortoiseList = new ArrayList<>();
        tortoiseList.add(new Tortoise2(40));
        tortoiseList.add(new Tortoise2(200));
        tortoiseList.add(new Tortoise2(30));
        tortoiseList.add(new Tortoise2(100));
        tortoiseList.add(new Tortoise2(250));

        Collections.sort(tortoiseList);
        for (Tortoise2 t : tortoiseList){
            System.out.println(t);
        }

        Set<String> set = new HashSet<>();
        set.add("King");
        set.add("KingSoft");
        set.add("King2");
        set.add("king1");

        List<String> list = new ArrayList<>(set);
        Collections.sort(list);
        for (String s : list){
            System.out.println(s);
        }
    }
}
