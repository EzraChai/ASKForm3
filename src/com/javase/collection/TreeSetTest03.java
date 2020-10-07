package com.javase.collection;

import java.util.TreeSet;

public class TreeSetTest03 {
    public static void main(String[] args) {
        Person p1 = new Person(32);
        Person p2 = new Person(15);
        Person p3 = new Person(42);


        TreeSet<Person> ts = new TreeSet<>();
        ts.add(p1);
        ts.add(p2);
        ts.add(p3);

        for (Person p : ts){
            System.out.println(p);
        }
    }
}

class Person implements Comparable<Person>{
    int age;
    public Person(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Age = " + age;
    }

    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }
}
