package com.singletion.register;

/**
 * 常量中去使用，常量就是用来大家共用的
 * 通常在爱 API中使用
 * 推荐使用枚举的方式创建单例对象
 */
public enum EnumSingleton {

    INSTRANCE;

    private Object date;

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }

    public static EnumSingleton getInstance(){
        return INSTRANCE;
    }
}
