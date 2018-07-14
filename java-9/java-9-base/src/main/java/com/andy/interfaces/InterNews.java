package com.andy.interfaces;

/**
 * java9新特性私有接口方法
 *
 * @Author: Mr.lyon
 * @CreateBy: 2018-07-14 09:45
 **/
public interface InterNews {

    void sayHello();

    default void defaultMethod() {
        init();
    }

    // This method is not part of the public API exposed by MyInterface
    private void init() {
        System.out.println("Initializing");
    }
}
