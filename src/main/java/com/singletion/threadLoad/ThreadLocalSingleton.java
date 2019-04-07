package com.singletion.threadLoad;

/**
 * 主要保证在同一个线程内，只有一个对象
 * 用于 ORM  动态配置多数据源的问题
 */
public class ThreadLocalSingleton {

    private ThreadLocalSingleton(){}

    private static final ThreadLocal<ThreadLocalSingleton> threadLoal = new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    public static ThreadLocalSingleton  getInstance(){
        return threadLoal.get();
    }
}
