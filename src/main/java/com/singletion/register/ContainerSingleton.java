package com.singletion.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * spring使用的注册单例的方式
 */
public class ContainerSingleton {
    /**
     * ConcurrentHashMap 只能保证它的内部是线程安全的
     * <p>
     * getBean 方法若是不加锁synchronized，在并发的环境下不能保证单例对象
     */
    private static Map<String, Object> ioc = new ConcurrentHashMap<String, Object>();

    private ContainerSingleton() {
    }
    public static Object getBean(String className) {
        synchronized (ContainerSingleton.class) {
            if (!ioc.containsKey(className)) {
                Object obj = null;
                try {
                    obj = Class.forName(className).newInstance();
                    ioc.put(className, obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return obj;
            }
            return ioc.get(className);
        }
    }
}
