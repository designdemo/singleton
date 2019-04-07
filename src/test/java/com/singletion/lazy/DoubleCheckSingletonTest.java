package com.singletion.lazy;

/**
 * 简单的懒汉式
 */
public class DoubleCheckSingletonTest {
    public static void main(String[] args) {
        Thread thread = new Thread(new ExectorThread());
        thread.start();

        Thread thread2 = new Thread(new ExectorThread());
        thread2.start();

        System.out.println("程序结束！！！");

    }
}
