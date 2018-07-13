package com.andy.model.order;

import com.andy.model.product.ProductException;
import com.andy.model.product.ProductService;
import com.andy.model.user.Entity;
import com.andy.model.user.UserService;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

/**
 * @Author: Mr.lyon
 * @CreateBy: 2018-07-13 22:53
 **/
public class ProductServiceImpl implements ProductService {

    private final Path dataPath = Paths.get(".");

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
