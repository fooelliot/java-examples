package com.andy.model.order.impl;

import com.andy.model.order.OrderException;
import com.andy.model.order.OrderService;
import com.andy.model.user.Entity;
import com.andy.model.user.UserService;

import java.util.List;
import java.util.Optional;

/**
 * @Author: Mr.lyon
 * @CreateBy: 2018-07-13 22:53
 **/
public class OrderServiceImpl implements OrderService {

    UserService userService = new UserService();

    public UserService getUser() {
        return userService;
    }

    @Override
    public <T extends Entity> List<T> list(Class<T> type) throws OrderException {
        return null;
    }

    @Override
    public <T extends Entity> Optional<T> get(Class<T> type) throws OrderException {
        return Optional.empty();
    }

    @Override
    public void save(Entity entity) throws OrderException {

    }

    @Override
    public <T extends Entity> void delete(Class<T> type, String id) {

    }
}
