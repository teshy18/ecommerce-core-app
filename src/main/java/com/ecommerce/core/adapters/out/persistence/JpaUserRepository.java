package com.ecommerce.core.adapters.out.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.ecommerce.core.adapters.out.mappers.UserMapper;
import com.ecommerce.core.domain.model.User;
import com.ecommerce.core.domain.port.out.UserRepository;
import com.ecommerce.core.infrastructure.persistence.SpringDataUserRepository;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class JpaUserRepository implements UserRepository{

    private final SpringDataUserRepository repo; 
    private final UserMapper mapper; 


    @Override
    public User save(User user) {
        return mapper.toDomain(repo.save(mapper.toDbo(user)));
    }

    @Override
    public User update(User user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public User delete(User user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public List<User> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
     public Optional<User> findByEmail(String email) {
        return repo.findByEmail(email)
                       .map(mapper::toDomain);
    }
}
