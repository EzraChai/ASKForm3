package com.javase.io;

import com.javase.io.bean.User;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectOutputStreamTest02 {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        userList.add(new User(101,"Chai Juan Zhe"));
        userList.add(new User(102,"Chloe Gan"));
        userList.add(new User(103,"Yuventhiran a/l Ramesh"));

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("UserFile"));
            oos.writeObject(userList);

            oos.flush();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
