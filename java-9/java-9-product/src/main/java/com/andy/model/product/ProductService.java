package com.andy.model.product;

import com.andy.model.user.Entity;
import com.andy.model.user.UserService;

import java.util.List;
import java.util.Optional;

/**
 * @Author: Mr.lyon
 * @CreateBy: 2018-07-13 22:31
 **/
public interface ProductService {

    UserService getUser();

    <T extends Entity> List<T> list(Class<T> type) throws ProductException;

    <T extends Entity> Optional<T> get(Class<T> type) throws ProductException;

    void save(Entity entity) throws ProductException;

    <T extends Entity> void delete(Class<T> type, String id);

}
