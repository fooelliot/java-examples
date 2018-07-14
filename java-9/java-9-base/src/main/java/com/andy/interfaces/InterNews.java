package com.andy.interfaces;

/**
 * java9新特性私有接口方法
 *
 * @Author: Mr.lyon
 * @CreateBy: 2018-07-14 09:45
 **/
public interface InterNews {

    String name = "hello";

    void sayHello();

    //java8
    static void staticMethod() {
        System.out.println("static method");
    }

    //java8
    default void defaultMethod() {
        init();
    }

    //java9 This method is not part of the public API exposed by MyInterface
    private void init() {
        System.out.println("Initializing");
    }
}
