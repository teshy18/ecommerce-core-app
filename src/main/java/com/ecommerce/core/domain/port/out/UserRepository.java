package com.ecommerce.core.domain.port.out;

import java.util.List;

import com.ecommerce.core.domain.model.User;

public interface UserRepository {

    User save(User user);

    User update(User user);

    User delete(User user);

    List<User> findAll();

}
