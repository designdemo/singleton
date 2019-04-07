package com.singletion.lazy;

import java.lang.reflect.Constructor;

public class StaticClassSingletonTest {

    public static void main(String[] args) {

        try {
            //拿到字节码文件
            Class<?> clazz = StaticClassSingleton.class;
            //根据反射拿到它的私有构造方法
            Constructor<?> declaredConstructor = clazz.getDeclaredConstructor(null);
            //强制访问
            declaredConstructor.setAccessible(true);

            //暴力初始化
            Object o1 = declaredConstructor.newInstance();
            Object o2 = declaredConstructor.newInstance();

            System.out.println(o1);
            System.out.println(o2);

            System.out.println(o1 == o2);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
