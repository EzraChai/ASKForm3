package com.javase.io;

import com.javase.io.bean.User;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectInputStreamTest02 {
    public static void main(String[] args) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("UserFile"));
            //Object obj = ois.readObject();
            //System.out.println(obj);
            List<User> users = (ArrayList<User>)ois.readObject();
            for (User u : users){
                System.out.println(u);
            }

            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
