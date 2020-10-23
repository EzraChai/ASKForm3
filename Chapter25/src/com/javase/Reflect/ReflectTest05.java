package com.javase.Reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectTest05 {
    public static void main(String[] args) {
        try {
            Class student = Class.forName("com.javase.Bean.Student");
            //Full Name
            String className = student.getName();
            System.out.println(className);

            //Simple Name
            String simpleName = student.getSimpleName();
            System.out.println(simpleName);

            System.out.println("_____________________________");

            Field[]fields = student.getFields();
            System.out.println(fields.length);

            Field f = fields[0];

            String fieldName = f.getName();
            System.out.println(fieldName);

            System.out.println("____________________________-");

            //Get all Fields
            Field[]fields1 = student.getDeclaredFields();
            for (Field s : fields1){

                //Get Modifier
                int i = s.getModifiers();
                System.out.println(i);// In number

                String modifierString = Modifier.toString(i);
                System.out.println("Modifier : "+modifierString);// In String

                //Get Type
                System.out.println("Type : "+s.getType().getSimpleName());

                //Get name
                System.out.println("Name : "+s.getName());
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
