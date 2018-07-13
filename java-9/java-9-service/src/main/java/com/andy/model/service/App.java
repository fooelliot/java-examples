package com.andy.model.service;

import com.andy.model.order.OrderService;

/**
 * @Author: Mr.lyon
 * @CreateBy: 2018-07-13 22:30
 **/
public class App {

    OrderService orderService = new OrderService();

    public void app() {
        orderService.getUser().sayHello();
    }


}
