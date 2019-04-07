package com.singletion.lazy;

public class DoubleCheckSingleton {

    private volatile static DoubleCheckSingleton LAZY = null;

    private DoubleCheckSingleton(){}

    public static DoubleCheckSingleton getInstance(){
        if(null == LAZY){
            synchronized (DoubleCheckSingleton.class){
                if(null == LAZY){
                    LAZY = new DoubleCheckSingleton();
                }
            }
        }
        return LAZY;
    }
}
