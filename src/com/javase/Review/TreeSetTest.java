package com.javase.Review;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(10);
        ts.add(100);
        ts.add(200);
        ts.add(50);

        Iterator<Integer> it = ts.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("---------------------------------------------");


        TreeSet<Integer> ts1 = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        ts1.add(10);
        ts1.add(100);
        ts1.add(200);
        ts1.add(50);

        for (Integer i : ts1){
            System.out.println(i);
        }
        System.out.println("---------------------------------------------");

        TreeSet<A> tsA = new TreeSet<>();
        tsA.add(new A(100));
        tsA.add(new A(345));
        tsA.add(new A(12340));
        tsA.add(new A(13400));
        tsA.add(new A(1343));
        tsA.add(new A(154));
        tsA.add(new A(132));
        tsA.add(new A(14));

        for(A a : tsA){
            System.out.println(a);
        }
        System.out.println("---------------------------------------------");

        TreeSet<B> treeB = new TreeSet<>(new B_Comparator());
        treeB.add(new B(12));
        treeB.add(new B(1223));
        treeB.add(new B(1212));
        treeB.add(new B(542));
        treeB.add(new B(65));
        treeB.add(new B(364));
        treeB.add(new B(1223));
        treeB.add(new B(43));

        for (B b : treeB){
            System.out.println(b);
        }
    }
}

class A implements Comparable<A>{
    int i;

    public A(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "A{" +
                "i=" + i +
                '}';
    }

    @Override
    public int compareTo(A o) {
        return this.i - o.i;
    }
}

class B{
    int x;

    public B(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "B{" +
                "x=" + x +
                '}';
    }
}

class B_Comparator implements Comparator<B>{
    @Override
    public int compare(B o1, B o2) {
        return o1.x - o2.x;
    }
}
