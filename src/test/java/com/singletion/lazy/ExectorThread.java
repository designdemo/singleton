package com.singletion.lazy;

import com.singletion.threadLoad.ThreadLocalSingleton;

public class ExectorThread implements Runnable {

    public void run() {

        ThreadLocalSingleton instance = ThreadLocalSingleton.getInstance();

//        DoubleCheckSingleton instance = DoubleCheckSingleton.getInstance();

//        SimpleLazySingleton instance = SimpleLazySingleton.getInstance();

        String s = Thread.currentThread().getName() + "----------" + instance;

        System.out.println(s);
    }
}
