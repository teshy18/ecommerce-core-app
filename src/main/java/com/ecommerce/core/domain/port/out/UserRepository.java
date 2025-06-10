package com.ecommerce.core.domain.port.out;

import java.util.List;
import java.util.Optional;

import com.ecommerce.core.domain.model.User;

public interface UserRepository {

    User save(User user);

    User update(User user);

    User delete(User user);

    List<User> findAll();

    Optional<User> findByEmail(String email);
}
