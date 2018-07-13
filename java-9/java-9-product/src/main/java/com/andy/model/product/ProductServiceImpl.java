package com.andy.model.product;

import com.andy.model.user.Entity;
import com.andy.model.user.UserService;

import java.util.List;
import java.util.Optional;

/**
 * @Author: Mr.lyon
 * @CreateBy: 2018-07-13 22:53
 **/
public class ProductServiceImpl implements ProductService {

    UserService userService = new UserService();

    public UserService getUser() {
        return userService;
    }

    @Override
    public <T extends Entity> List<T> list(Class<T> type) throws ProductException {
        return null;
    }

    @Override
    public <T extends Entity> Optional<T> get(Class<T> type) throws ProductException {
        return Optional.empty();
    }

    @Override
    public void save(Entity entity) throws ProductException {

    }

    @Override
    public <T extends Entity> void delete(Class<T> type, String id) {

    }
}
