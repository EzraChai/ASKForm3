package com.javase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

public class CollectionTest05 {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        User u1 = new User("Jack");
        User u2 = new User("Jack");
        c.add(u1);

        System.out.println(c.contains(u2));
        System.out.println(c.equals(u2));

        Integer x = new Integer(1000);
        c.add(x);
        Integer y = new Integer(1000);
        System.out.println(c.contains(y));

        Collection c2 = new ArrayList();
        String s1 = new String("Hello");
        c2.add(s1);
        String s1a = new String("Hello");
        c2.add(s1a);
        System.out.println(c2.size());

        String s2 = new String("Hello");
        c2.remove(s2); // .equals()
        int size = c2.size();
        System.out.println(size);
        c2.remove(s2);
        System.out.println(c2.size());
    }
}

class User{
    private String name;
    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }
}
