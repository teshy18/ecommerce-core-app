package com.ecommerce.core.domain.port.in;

import java.util.List;

import com.ecommerce.core.domain.model.User;

public interface UserService {

    void createUser(User user);

    List<User> getAllUser();

}
