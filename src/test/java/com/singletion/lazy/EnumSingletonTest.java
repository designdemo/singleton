package com.singletion.lazy;

import com.singletion.register.EnumSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class EnumSingletonTest {

    public static void main(String[] args) {
        EnumSingleton s1 = null;
        EnumSingleton s2 = EnumSingleton.getInstance();
        s2.setDate(new Object());

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("EnumSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();


            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (EnumSingleton)ois.readObject();
            ois.close();

            System.out.println(s1.getDate());
            System.out.println(s2.getDate());
            System.out.println(s1.getDate() == s2.getDate());

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Class<?> clazz = EnumSingleton.class;
            Constructor<?> c = clazz.getDeclaredConstructor(String.class,int.class);
            c.setAccessible(true);

            EnumSingleton o = (EnumSingleton) c.newInstance("chuan",111);

            System.out.println(o);


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
