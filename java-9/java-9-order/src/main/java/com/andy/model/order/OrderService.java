package com.andy.model.order;

import com.andy.model.user.UserService;

/**
 * @Author: Mr.lyon
 * @CreateBy: 2018-07-13 22:31
 **/
public class OrderService {

    UserService userService = new UserService();

    public void sayHello() {
        System.out.println("hello order service");
        userService.sayHello();
    }


}
