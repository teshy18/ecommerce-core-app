package com.ecommerce.core.domain.port.in;

import java.util.List;

import com.ecommerce.core.domain.model.User;

public interface UserService {

    User createUser(User user);

    User editUser(User user);

    User deletUSer(User user);

    List<User> getAllUser();



}
