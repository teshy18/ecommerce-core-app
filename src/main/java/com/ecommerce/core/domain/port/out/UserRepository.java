package com.ecommerce.core.domain.port.out;

import java.util.List;

import com.ecommerce.core.domain.model.User;

public interface UserRepository {

    void save(User user);

    List<User> findAll();

}
