package com.javase.Reflect;

import com.javase.Bean.VIP;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectTest12 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        VIP v1 = new VIP();
        VIP v2 = new VIP(110,"Chloe","2005-09-20",true);

        Class c = Class.forName("com.javase.Bean.VIP");
        Object obj = c.newInstance();

        Constructor con = c.getDeclaredConstructor(int.class,String.class,String.class ,boolean.class);

        Object obj2 = con.newInstance(110,"Chloe","2005-09-20",true);
        System.out.println(obj2);
    }

}
