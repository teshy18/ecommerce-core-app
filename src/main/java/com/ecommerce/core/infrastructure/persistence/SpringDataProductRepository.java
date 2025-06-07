package com.ecommerce.core.infrastructure.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.core.infrastructure.persistence.dbo.ProductDbo;

@Repository
public interface SpringDataProductRepository extends JpaRepository<ProductDbo, Long>{

    List<ProductDbo> findByNameContainingIgnoreCase(String name);

}
