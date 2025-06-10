package com.ecommerce.core.infrastructure.persistence;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ecommerce.core.infrastructure.persistence.dbo.UserDbo;

public interface SpringDataUserRepository  extends JpaRepository<UserDbo, Long> {

    Optional<UserDbo> findByEmail(String email);

}
