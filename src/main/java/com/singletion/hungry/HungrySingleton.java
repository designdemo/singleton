package com.singletion.hungry;

/**
 * 饿汉式
 * 在类加载的时候就立即初始化，并创建单例对象
 * 优点：没有任何的锁，执行效率较高
 * 缺点：类加载的时候就立即初始化，不管你是否使用都占用空间
 *
 * 线程绝对安全，在线程还没出现就已经实例化了，不可能存在线程安全的问题
 */
public class HungrySingleton {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
