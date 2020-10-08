package com.javase.Review;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("abc");
        hs.add("efg");
        hs.add("Chloe");

        Iterator<String> it = hs.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        for (String s : hs){
            System.out.println(s);
        }
        System.out.println("------------------------------------");

        Set<Student> studentSet = new HashSet<>();
        Student s1 = new Student(001,"Chai Juan Zhe" );
        Student s2 = new Student(002,"Chloe Gan" );
        Student s3 = new Student(003,"Yuventhiran a/l Ramesh" );
        //Student s4 = new Student(002,"Chloe Gan");

        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);

        for (Student s : studentSet){
            System.out.println(s);
        }

    }
}

class Student{
    int no;
    String name;

    public Student() {
    }

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "No. " + no + " Name ==> " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return no == student.no &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, name);
    }

}
