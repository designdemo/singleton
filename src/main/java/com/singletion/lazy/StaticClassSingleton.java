package com.singletion.lazy;

/**
 * 静态内部类的单例模式
 * 这种方式巧妙的兼顾了 饿汉式 浪费资源的问题，及synchronized的性能问题
 * 完美的屏蔽了这个缺点
 * 是史上最流弊的写法
 * 但是防止不了反射的暴力攻击
 */
public class StaticClassSingleton {

    private StaticClassSingleton(){
//        if(Inner.LAZY != null){
//            throw new RuntimeException("不可以创建多个实例！！！");
//        }
    }

    //static 使单例的空间共享
    //final 保证这个方法不会被重载、重写
    public static final StaticClassSingleton getInstance(){
        //在返回结果之前、一定会先加载内部类
        return Inner.LAZY;
    }

    //默认不加载
    public static class Inner{
        public static final StaticClassSingleton LAZY = new StaticClassSingleton();
    }
}
