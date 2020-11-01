package com.javase.Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class ReflectTest11 {
    public static void main(String[] args) throws ClassNotFoundException {
        StringBuilder s = new StringBuilder();
        Class vipClass = Class.forName("com.javase.Bean.VIP");

        s.append(Modifier.toString(vipClass.getModifiers()) +" class "+vipClass.getSimpleName() +" {\n");

        Constructor[]constructors = vipClass.getDeclaredConstructors();
        for (Constructor constructor : constructors){
            // public VIP(int no, String name, String birth, boolean sex) {
            s.append("\t");
            s.append(Modifier.toString(constructor.getModifiers()));
            s.append(" ");
            s.append(vipClass.getSimpleName() + "(");

            Class[]parameter = constructor.getParameterTypes();
            for (Class parameterTypes : parameter){
                s.append(parameterTypes.getSimpleName() + ",");

            }
            if (parameter.length > 0) {
                s.deleteCharAt(s.length() - 1);
            }
            s.append("){}\n");
        }

        s.append("\n}");

        System.out.println(s);
    }
}
