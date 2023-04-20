package com.alphadev.designpatterns;

public class MultithreadSingleton {

    private static MultithreadSingleton instance = null;

    public MultithreadSingleton() {
    }

    public static MultithreadSingleton getInstance() {
        //Question arise why we have two null check here.
        //Reason for first null check is same as explained in method level synchronization
        if(instance == null) {
            // Our method is static, so we have class level locking here
            synchronized (MultithreadSingleton.class) {
                //Reason for second null check is let's say two objects are come inside first
                //One call has taken lock and proceeds for creating object first time. Now
                //t2 should not create the object because its already created and that's why
                if(instance == null) {
                    instance = new MultithreadSingleton();
                }
            }
        }
        return instance;
    }
}
