package com.javase.io;

import com.javase.io.bean.Student;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamTest01 {
    public static void main(String[] args) {
        Student s1 = new Student(101,"Chai Juan Zhe");

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Student"));
            oos.writeObject(s1);

            oos.flush();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
