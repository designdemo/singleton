package com.singletion.lazy;

import com.singletion.threadLoad.ThreadLocalSingleton;

public class ThreadLocalSingletonTest {

    public static void main(String[] args) {
        System.out.println(ThreadLocalSingleton.getInstance());

        Thread t1 = new Thread(new ExectorThread());
        t1.start();

        Thread t2 = new Thread(new ExectorThread());
        t2.start();
    }

}
