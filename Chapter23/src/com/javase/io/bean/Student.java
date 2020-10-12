package com.javase.io.bean;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 3153270147599681971L;
    private int no;
    private String name;
    private int age;
    private String email;

    //com.javase.io.bean.Student; local class incompatible: stream classdesc serialVersionUID = -1491027588127096737, local class serialVersionUID = -5085836042088178254
    //Abnormal
    //stream classdesc serialVersionUID = -1491027588127096737(after)
    //local class serialVersionUID = -5085836042088178254(before)
    //private static final long serialVersionUID = 245789547332704L;

    public Student() {
    }

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public Student(int no, String name, int age) {
        this.no = no;
        this.name = name;
        this.age = age;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
