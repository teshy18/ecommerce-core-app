package com.ecommerce.core.adapters.out.mappers;

import org.mapstruct.Mapper;

import com.ecommerce.core.domain.model.User;
import com.ecommerce.core.infrastructure.persistence.dbo.UserDbo;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toDomain(UserDbo dbo);

    UserDbo toDbo(User domain);

}
