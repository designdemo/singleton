package com.singletion.lazy;

import com.singletion.register.ContainerSingleton;

public class ContainerSingletonTest {
    public static void main(String[] args) {
        try{
            ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler(){
                public void handler() {
                    Object bean = ContainerSingleton.getBean("com.singletion.lazy.Pojo");
                    System.out.println(System.currentTimeMillis() +" : "+bean);
                }
            },20,6);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
