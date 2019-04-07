package com.singletion.lazy;

/**
 * 简单的懒汉式
 */
public class SimpleLazySingleton {

    private static SimpleLazySingleton lazy = null;

    private SimpleLazySingleton(){}

    public static synchronized SimpleLazySingleton getInstance(){
        if(null == lazy){
            lazy = new SimpleLazySingleton();
        }
        return lazy;
    }
}
