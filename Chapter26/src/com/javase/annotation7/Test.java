package com.javase.annotation7;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("com.javase.annotation7.User");
            boolean flag = false;

            if (c.isAnnotationPresent(Id.class)){
                Field[] userClass = c.getDeclaredFields();
                for (Field field : userClass){
                    if ("Id".equals(field.getName()) && "int".equals(field.getType().getSimpleName())){
                        flag = true;
                        break;
                    }
                }

                if (!flag){
                    throw new HasNotIDPropertiesException("被@Id 注解标记的类中必须有一个int类型的id属性");
                }

            }

        } catch (ClassNotFoundException | HasNotIDPropertiesException e) {
            e.printStackTrace();
        }

    }
}
