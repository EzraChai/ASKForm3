package com.javase.collection;

import com.javase.bean.Student;

import java.util.HashSet;
import java.util.Set;

public class HashMapTest02 {
    public static void main(String[] args) {
        Student s1 = new Student("Chloe");
        Student s2 = new Student("Chloe");
        //Before override equals
        // System.out.println(s1.equals(s2));//false

        //After override equals
        System.out.println(s1.equals(s2));

        //HashCode
        System.out.println("s1's HashCode"+s1.hashCode());
        System.out.println("s2's HashCode"+s2.hashCode());

        Set<Student> students = new HashSet<>();
        students.add(s1);
        students.add(s2);
        System.out.println(students.size());
    }
}
