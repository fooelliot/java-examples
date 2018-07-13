package com.andy.model.order;

import com.andy.model.user.Entity;
import com.andy.model.user.UserService;

import java.util.List;
import java.util.Optional;

/**
 * @Author: Mr.lyon
 * @CreateBy: 2018-07-13 22:31
 **/
public interface OrderService {

    UserService getUser();

    <T extends Entity> List<T> list(Class<T> type) throws OrderException;

    <T extends Entity> Optional<T> get(Class<T> type) throws OrderException;

    void save(Entity entity) throws OrderException;

    <T extends Entity> void delete(Class<T> type, String id);

}
