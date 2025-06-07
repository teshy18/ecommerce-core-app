package com.ecommerce.core.adapters.out.persistence;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.ecommerce.core.adapters.out.mappers.ProductMapper;
import com.ecommerce.core.domain.model.Product;
import com.ecommerce.core.domain.port.out.ProductRepository;
import com.ecommerce.core.infrastructure.persistence.SpringDataProductRepository;
import com.ecommerce.core.infrastructure.persistence.dbo.ProductDbo;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class JpaProductRepository implements ProductRepository {

    private final SpringDataProductRepository productRepo;
    private final ProductMapper mapper;

    @Override
    public Product save(Product product) {

        ProductDbo dbo = mapper.toDbo(product);
        ProductDbo savedProduct = productRepo.save(dbo);
        return mapper.toDomain(savedProduct);
    }

    @Override
    public List<Product> findAll() {
        return productRepo.findAll().stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());
    }

}
