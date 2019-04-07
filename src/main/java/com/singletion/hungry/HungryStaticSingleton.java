package com.singletion.hungry;

/**
 * 静态代码块 饿汉式
 */
public class HungryStaticSingleton {

    private static final HungryStaticSingleton hungryStaticSingleton;

    static{
        hungryStaticSingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton(){}

    public static HungryStaticSingleton getInstance(){
        return hungryStaticSingleton;
    }
}
