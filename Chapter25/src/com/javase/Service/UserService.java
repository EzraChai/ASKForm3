package com.javase.Service;

public class UserService {
    //Login Method
    public boolean login(String username,String password){
        if (username.equals("admin") && password.equals("admin")){
            return true;
        }
        return false;
    }

    //Log Out Method
    public void logout(){
        System.out.println("Log out completed");
    }
}
